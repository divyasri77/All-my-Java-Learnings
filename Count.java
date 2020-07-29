/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
         int pos=0;int neg=0;int zero=0;
        System.out.println("enter the total number of elements");
        int n=obj.nextInt();
        System.out.println("enter the numbers");
        for (int i = 0; i < n; i++) {
            int a=obj.nextInt();
           
            if (a>0) {
                pos++;
            }
            else if(a<0)
            {
              neg++;
            }
            else
            {
                zero++;
            }
           
        }
        
        System.out.println("pos no"+pos+"neg no"+neg+"zero no"+zero);
            
            
        
    }
    
}
