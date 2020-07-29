/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author divya
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c,d;
       Scanner input=new Scanner(System.in);
       System.out.println("enter the amount and discount");
       int a=input.nextInt();
       int b=input.nextInt();
       c=(a/100)*b;
       System.out.println("the reduced amount is"+(a-c));
       // TODO code application logic here
    }
    
}
