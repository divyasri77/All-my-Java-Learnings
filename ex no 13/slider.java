
package swingdm;

import java.awt.Color;


public class slider extends javax.swing.JFrame {

    public slider() {
        initComponents();
        jTextField1.setBackground(Color.GRAY);
    }
  
                          
    private void initComponents() {

        labelred = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        labelgreen = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        labelblue = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelred.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelred.setForeground(new java.awt.Color(255, 51, 51));
        labelred.setText("RED");

        jSlider1.setMajorTickSpacing(50);
        jSlider1.setMaximum(250);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);

        labelgreen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelgreen.setForeground(new java.awt.Color(0, 204, 51));
        labelgreen.setText("GREEN");

        jSlider2.setMajorTickSpacing(50);
        jSlider2.setMaximum(250);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(0);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        labelblue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelblue.setForeground(new java.awt.Color(0, 51, 255));
        labelblue.setText("BLUE");

        jSlider3.setMajorTickSpacing(50);
        jSlider3.setMaximum(250);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setValue(0);
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("COLOR PALETTE");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSlider2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelblue, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelred, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelred, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelblue, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        changecolor();
        labelred.setText("Red(R="+jSlider1.getValue()+")");
    }                                           

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        changecolor();
         labelgreen.setText("Green(G="+jSlider2.getValue()+")");
    }                                     

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {                                      
         changecolor(); 
          labelblue.setText("Blue(B="+jSlider3.getValue()+")");
    }                                     

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slider().setVisible(true);
            }
        });
    }

                     
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelblue;
    private javax.swing.JLabel labelgreen;
    private javax.swing.JLabel labelred;
                 

    private void changecolor() {
         int R,G,B;
         R=jSlider1.getValue();
         G=jSlider2.getValue();
         B=jSlider3.getValue();
         
         jTextField1.setBackground(new Color(R,G,B));
         
    }
   
    }

   
    

