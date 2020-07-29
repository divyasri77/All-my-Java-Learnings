/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calci;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Calci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter the two values");
       int a=obj.nextInt();
       int b=obj.nextInt();
        System.out.println("enter the char +,-,*,% ");
        char ch=obj.next().charAt(0);
        switch (ch) {
            case'+':
                System.out.println("sum is:"+(a+b));
                break;
                
            case '-' :
                System.out.println("sum is:"+(a-b));
                break;
            case '*':
                System.out.println("sum is:"+(a*b));
                break;
            case '%':
                System.out.println("sum is:"+(a%b));
                break;
            default:
                throw new AssertionError();
        }
// TODO code application logic here
    }
    
}
