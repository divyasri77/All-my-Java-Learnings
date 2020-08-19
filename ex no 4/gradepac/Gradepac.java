/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradepac;
import year1.year1mark;
import year2.year2marks;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Gradepac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the total number of students");
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 1; i <= n; i++) 
        {
        System.out.println("\nenter the name of the student :"+i);
        String name=s.next();
        System.out.println("enter the roll no");
        int roll=s.nextInt();
        int sub1,sub2,sub3,sub4;
        System.out.println("enter the two subject marks of year1:");
        sub1=s.nextInt();
        sub2=s.nextInt();
        year1mark obj=new year1mark();
        obj.getmarks(sub1,sub2);
        System.out.println("\nenter the two subject marks of year2:");
        sub3=s.nextInt();
        sub4=s.nextInt();
        year2marks obj1=new year2marks();
        obj.getmarks(sub3,sub4);
        }
    }
    
}
class student
{
    int roll_no;
    String name;

}