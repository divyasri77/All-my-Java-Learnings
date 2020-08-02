/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concate;
import java.util.Scanner;
/**
 *
 * @author divya
 */
public class Concate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int a=obj.nextInt();
        String s;
        for (int i = 1; i <= a; i++) {
            s=" "+i;
            System.out.print(s);
        }
    }
    
}
