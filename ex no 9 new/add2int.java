/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.Scanner;


/**
 *
 * @author divya
 */
public class add2int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         try
        {
        checker();   
        }
         catch(notvalid e)
         {
             System.out.println(e);
         }
    

    public void checker()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first integer");
        String one=obj.next();
        System.out.println("enter the second integer");
        String two=obj.next();
        
        char []str=one.toCharArray();
        for(int i=0;i<one.length()-1;i++)
        {
            if(str[i]<=57 && str[i]>=48)
            {
                continue;
            }
            else
            {
                try {
                    throw new notvalid("improper integer input");
                } catch (notvalid ex) {
                    System.out.println("error");
                }
            }
           
        char []str1=two.toCharArray();
        for(int j=0;j<two.length()-1;j++)
        {
            if(str1[j]<=57 && str1[j]>=48)
            {
                continue;
            }
            else
            {
                try {
                    throw new notvalid("improper integer input");
                } catch (notvalid ex) {
                    System.out.println("error");
                }
            }
            
        }
        
        int first=Integer.parseInt(one);
        int second=Integer.parseInt(two);
            String m = null;
            String n = null;
            System.out.println("added result is:"+(m+n));
        }
    }
}
    class notvalid extends Exception
    {
        public notvalid(String str1)
        {
            super(str1);
        }
    }
            
    

