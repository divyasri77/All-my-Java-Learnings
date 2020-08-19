/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
import pack.A;
import pack2.B;

/**
 *
 * @author divya
 */
public class Mypackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name="hello world";
        A obj = new A();  
        obj.getname(name);
        String name2="hello world 2";
        B obj1 = new B();  
        obj1.getname1(name2);
                            
    }
    
}
