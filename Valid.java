/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valid;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Valid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int a=obj.nextInt();
        switch (a) {
            
            case 1:
                
                break;
                case 2:
                    System.out.println(a+"valid");
                break;
                case 3:
                System.out.println(a+"valid");
                break;
                case 4:
                System.out.println(a+"valid");
                break;
                case 5:
                System.out.println(a+"valid");
                break;
                case 6:
                System.out.println(a+"valid");
                break;
                case 7:
                System.out.println(a+"valid");
                break;
                case 8:
                System.out.println(a+"valid");
                break;
                case 9:
                System.out.println(a+"valid");
                break;
                case 10:
                System.out.println(a+"valid");
                break;
                
            default:
              System.out.println(a+"not valid");
        }
        // TODO code application logic here
    }
    
}
