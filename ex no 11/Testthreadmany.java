/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthreadmany;

/**
 *
 * @author divya
 */
public class Testthreadmany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread t1, t2,t3,t4; 
        System.out.println("$ javaTestThreadMany 4");
    t1 = new MyThread ("Hello, I am Thread #1"); 
    t2 = new MyThread ("Hello, I am Thread #2"); 
    t3 = new MyThread ("Hello, I am Thread #3"); 
    t4 = new MyThread ("Hello, I am Thread #4"); 
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    }
    
}
class MyThread extends Thread { 

  public MyThread (String s) { 
    super(s); 
  }
 
  public void run() { 
    System.out.println("Hello, I am "+ getName()); 
  } 
}