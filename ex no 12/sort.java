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
public class sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer a[]={4,6,2,9,3};
        assending<Integer> obj=new assending<>(a);   //passing integer
        obj.display();
        
        Double d[]={43544.00,5667.00,8793.00,23546.00};
        assending<Double> obj1=new assending<>(d);   //passing double
        obj1.display();
        
        Float f[]={43544.2f,5667.1f,8793.3f,23546.2f}; //passing float
        assending<Float> obj2=new assending<>(f);
        obj2.display();
    }
    
}
class assending<T>
{
    T[] b;
    public assending(T[] b)
    {
        this.b=b;
    }
    public void display()
    {
       Arrays.sort(b);   //sorting im assending order
        System.out.println(Arrays.toString(b));
    }
}