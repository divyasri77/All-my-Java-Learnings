/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author divya
 */
public class Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter the number of threads you want to create") ; 
        int number =Integer.parseInt(args[0]);
   
        ThreadTest t[]= new ThreadTest[number];
        

  for(int a =1 ; a<=number ; a++){
          
     test[a] = new ThreadTest ("Thread #"+i);
     test[a].start();
    try{
        test[a].join()
    }
  catch(InterruptedException e){

       System.out.print(e);

     }

    }
   }
}
    
    

