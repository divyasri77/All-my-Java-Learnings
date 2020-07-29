/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author divya
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("enter the 3 values");
       int a=obj.nextInt();
        int b=obj.nextInt();
         int c=obj.nextInt();
         if(a>b && a>c)
         {
             System.out.println("a is greater");
         }
         else if(b>a && b>c)
         {
             System.out.println("b is greater");
         }
         else 
         {
             System.out.println("c is greater");
         }
       
       // TODO code application logic here
    }
    
}
