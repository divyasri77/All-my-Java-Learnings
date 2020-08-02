/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greet;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Greet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter the student mark for 100");
        int a=obj.nextInt();
        if(a>90)
            System.out.println("excellent");
        else if(a>80)
            System.out.println("good");
        else if(a>70)
            System.out.println("better");
        else if(a>60)
            System.out.println("can try better");
        else
            System.out.println("poor");
    }
    
}
