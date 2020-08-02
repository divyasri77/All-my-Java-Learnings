/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("enter the total number of element");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element"+(i+1));
            a[i]=obj.nextInt();
        }
       int smallest=a[0];
       int largest=a[0];
           
       for(int i=1;i<n;i++)
       {
           if(a[i]>largest)
              largest=a[i];
           else if(a[i]<smallest)
               smallest=a[i];
       }
        System.out.println("largest number in the array is :"+largest);
        System.out.println("smallest number in the array is:"+smallest);
    }
       
            
   
    }
    

