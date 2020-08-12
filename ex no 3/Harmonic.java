/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonic;


/**
 *
 * @author divya
 */
public class Harmonic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       { 
        int i=Integer.parseInt(args[0]);//command line argument
        abc.series(i);
        
    }
    }
      class abc
    {
        
        static double r=0;
        
         static void series(int i)
        {
           
            while(i>0)
            {
                r=(r+((double)1/i));
                i--;
            }  
            System.out.println("the harmonic series is"+r);
        }        
    }        
}