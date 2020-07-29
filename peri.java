/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class javaapplication1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.println("ENTER SIDE OF SQUARE");
      int a=obj.nextInt();
      System.out.println("perimeter of square"+(4*a));
     // TODO code application logic here
    }
    
}
