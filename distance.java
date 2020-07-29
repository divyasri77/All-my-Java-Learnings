/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("enter the distances");
       int x1=input.nextInt();
       int x2=input.nextInt();
       int y1=input.nextInt();
       int y2=input.nextInt();
       double distance=Math.sqrt(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
       System.out.println(distance);
       // TODO code application logic here
    }
    
}
