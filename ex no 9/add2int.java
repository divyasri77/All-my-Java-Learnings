/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author divya
 */
public class add2int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
         try
        {
           int a =obj.nextInt();
           int b =obj.nextInt();
           try
           {
           if((a>-1&a<10) && (b<10&b>-1))
           {
               System.out.println(a+b);
           }
           else
           {
               System.out.println("wrong input");
           }
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
               
       }
         catch(Exception e)
                 {
                     System.out.println(e);
                 }
    }
    
}

    
    

