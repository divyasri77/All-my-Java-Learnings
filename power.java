/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n=obj.nextInt();
        System.out.println("enter the power");
        int p=obj.nextInt();
        int s=1;
        for(int i=0;i<p;i++)
        {
            s=s*n;
            
        }
        System.out.println("the ans is"+s);
        

        
        
        // TODO code application logic here
    }
    
}
