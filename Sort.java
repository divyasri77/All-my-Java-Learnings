/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;
import java.util.Scanner;


/**
 *
 * @author divya
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=obj.nextInt();
        int a[]=new int[100];
        int temp;
        for(int i=0;i<n;i++)
        {
        System.out.println("enter the number"+(i+1));
        a[i]=obj.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    
                }
            }
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println("element"+(i+1)+": "+a[i]);
        }
        // TODO code application logic here
    }
    
}
