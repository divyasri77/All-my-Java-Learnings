/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        author obj1=new author("Anna todd","xyz@gmail.com",'f');
        books obj=new books("After",obj1,250,1);
        System.out.println(obj.getname());
        System.out.println(obj.getprice());
        obj.setprice(300);
        System.out.println(obj.getquantity());
        obj.setquantity(2);
        System.out.println(obj1);
        System.out.println(obj);
    }
    
}
class books
{
    String name;
    author author;
    double price;
    int quantity=0;
    books(String n,author au,double pr,int q)
    {
        name=n;
        author=au;
        price=pr;
        quantity=q;
    }
    String getname()
    {
        return name;
    }
    author getauthor()
    {
        return author;
    }
    double getprice()
    {
        return price;
    }
    void setprice(double p1)
    {
        price=p1;
    }
    int getquantity()
    {
        return quantity;
    }
    void setquantity(int q1)
    {
        quantity=q1;
    }
    public String toString()
    {
        return "\nname:"+name+"\nauthor deatails\n"+author.toString()+"\nprice"+price+"\nquantity:"+quantity;
    }
}
class author
{
    String name;
    String email;
    char gender;
    author(String n1,String e,char ge)
    {
        name=n1;
        email=e;
        gender=ge;
    }
    public String toString()
    {
     return "name:"+name+"\nemail:"+email+"\ngender:"+gender;   
    }
}