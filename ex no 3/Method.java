/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
         Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c:");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        greatest.max3(a,b,c);
        System.out.println("Enter the value of d,e,f:");
        double d=obj.nextDouble();
        double e=obj.nextDouble();
        double f=obj.nextDouble();
        greatest.max3(d,e,f);
        
    }
}
    class greatest{
    static void max3(int a,int b, int c){
        if(a>b && a>c)
            System.out.println("a is greater");
        else if(b>c)
            System.out.println("b is greater");
        else
            System.out.println("c is greater");
        
    }
    static void max3(double d,double e, double f){
        if(d>e && d>f)
            System.out.println("d is greater");
        else if(e>f)
            System.out.println("e is greater");
        else
            System.out.println("f is greater");
        
    }
}
