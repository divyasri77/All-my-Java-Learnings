/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n=obj.nextInt();
        int s=0,r;
        while (n!=0) {
            r=n%10;
            s=s+r;
            n=n/10;
            
        }
        System.out.println("the sum of elements is"+s);
            
        
    }
    
}
