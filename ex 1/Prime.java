/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int flag=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n=obj.nextInt();
       
        for (int i = 2; i < n/2; i++) {
            if(n%i==0)
            {
              flag=1;
              break;
            }         
        }
        if(flag==1)
            System.out.println("not a prime number");
        else
            System.out.println("prime number");
            
    }
    
}
