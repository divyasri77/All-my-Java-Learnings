/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year2;

/**
 *
 * @author divya
 */
public class year2marks {
    public void getmarks(int m3,int m4){
            System.out.println("subject 1 mark :"+m3+"\nsubject 2 mark :"+m4);  
              if(m3 >=50 )
            {
                System.out.println("mark 1 grade is pass");
            }
            else
            {
                    System.out.println("mark 1 grade is fail");
            }
            if(m4 >=50 )
            {
                System.out.println("mark 2 grade is pass");
            }
            else
                System.out.println("mark 2 grade is fail");
    }
}
