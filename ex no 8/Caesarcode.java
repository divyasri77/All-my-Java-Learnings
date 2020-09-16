/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcode;

import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Caesarcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        char b;
        int m=0,m1;char m2;
        System.out.println("enter the plaintext string");
        String str=obj.next();
        System.out.println("enter the number of position");
        int n=obj.nextInt();
        for (int i = 0; i < str.length(); i++) {
             b=str.charAt(i);
             m=(int)b;
             m1=m+n;
             m2=(char)m1;
             System.out.print(Character.toUpperCase(m2));
        }
    }
    
}
