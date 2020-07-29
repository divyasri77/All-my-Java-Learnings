/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inttodigit;
import java.util.Scanner();

/**
 *
 * @author divya
 */
public class Inttodigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("enter the number");
       int n=obj.nextInt();
       int r=0;int s=0;int r1;
       while(n!=0)
       {
         r=n%10;
         s=(s*10)+r;
         n=n/10;
        }
       while(s!=0)
       {
       r1=s%10;
       System.out.println(r1);
       s=s/10;
    }
    
}
