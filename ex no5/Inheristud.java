/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheristud;
import java.util.Scanner;


/**
 *
 * @author divya
 */
public class Inheristud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
         sports obj1=new sports();
         obj1.calculate();
         obj1.display();
    }
    }
    
}
class student
{
    String sname;
    int roll_no;
    Scanner obj=new Scanner(System.in);
    static int i=1;
     public void read()
     {
        
         System.out.println("\nenter the student name:"+i);
         sname=obj.next();
         System.out.println("enter the roll no:");
         roll_no=obj.nextInt();
         i++;
       
        }
     public void display()
     {
        System.out.println("\nStudent Details");
        System.out.println("name:"+sname);
        System.out.println("Rollno:"+roll_no);
        
     }

    
}
class result extends student
{
    int m1,m2,m3;
    public void read()
    {
    super.read();
    System.out.println("enter the mark 1 ");
    m1=obj.nextInt();
    System.out.println("enter the mark 2");
    m2=obj.nextInt();
 
    
    }
    public void display()
            
    {
        super.display();
        System.out.println("Student Mark Details");
        System.out.println("Mark1:"+m1+"\nMark2:"+m2);
    }
}
class sports extends result
{
    double total;
    int point;
    public void calculate()
    {
        super.read();
        System.out.println("enter the sports point");
        point=obj.nextInt();
        total=m1+m1;
        }
   public void display()
    {
        super.display();
        System.out.println("total :"+total);
        if(m1>=50 && m2>=50)
            System.out.println("2 marks is greater than 50 so PASS");
        else
            System.out.println("fail");
        System.out.println("point :"+point);
        
    }
}


