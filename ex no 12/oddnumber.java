/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericprogram;

import java.util.Arrays;

/**
 *
 * @author divya
 */
public class oddnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer a[]={2,3,4,5,7,8};
        demo<Integer> obj=new demo<>(a);
        obj.checkodd();
        obj.exchangeposition(2,5);
        System.out.println(obj.max()); //here printing thr returned value of maximum element
        
    }
    
}
class demo<T extends Number>
{
    T[] b;
    int odd=0;
    int max;

   public demo(T[] b)
   {
       this.b=b;
   }
   public void checkodd() //checking odd number
   {
       for (int i = 0; i < b.length; i++)
       {
           if((Integer)b[i]%2!= 0)
           {
             odd++;  
           }
       }
       System.out.println(odd); //printing the odd numbers in the array
   }
   public void exchangeposition(int c,int d) //swaping the elements in the given position
   {
       for (int i = 0; i < b.length; i++) 
       {
           if(b[i]==b[c])
           {
               Object temp=b[c];
               b[c]=b[d]; 
               b[d]=(T) temp;
           }
       }
       System.out.println(Arrays.toString(b)); //printing via tostring function
   }
   public T max()
   {
      Arrays.sort(b);     //used array.sort function for sorting
      return b[(b.length)-1];    
   }
}
   
  
   

