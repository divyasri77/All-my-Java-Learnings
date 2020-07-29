/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=0;int j,m;
        System.out.println("enter the number");
        
       
        int n=input.nextInt();
        int a[]=new int[10];
        for(i=0;i<n;i++)
        {
            System.out.println("enter the element"+(i+1));
            a[i]=input.nextInt();
        }
        for(j=i-1;j>=0;j--)
        {
            System.out.println(a[j]);
        }
        // TODO code application logic here
    }
    
}
