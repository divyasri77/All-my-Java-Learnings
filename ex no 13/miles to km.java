/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

/**
 *
 * @author divya
 */
public class km extends javax.swing.JFrame {

    /**
     * Creates new form newJFrame
     */
    public km() {
        initComponents();
    }
    public void convert()
    {
      if (jTextField4.getText() != null ) {
       jTextField5.setText("" + Double.parseDouble(jTextField4.getText()) * 1.609);
           
    } 
 
    } 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 204, 204));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("     CONVERT MILES TO KILOMETERS");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(34, 29, 251, 41);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(153, 204, 255));
        jTextField2.setText("enter number of miles:");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(20, 98, 136, 42);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("COVERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(114, 223, 102, 42);

        jTextField3.setBackground(new java.awt.Color(153, 204, 255));
        jTextField3.setText("answer in km");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(20, 164, 88, 37);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(223, 98, 82, 42);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(223, 164, 82, 37);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 160, 40, 40);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         


        convert();
    }                                        

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    }                                           

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
 
    }                                           

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new km().setVisible(true);
            }
        });
    }
                   
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
                      
}
