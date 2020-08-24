
 
/*A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and
Bank C respectively. We have to print the money deposited by him in a particular bank. 
Create a class ‘Bank’; with a method ‘getBalance’;which returns 0. Make its three
subclasses named ‘BankA’’BankB’and’BankC’with a method with the same name
‘getBalance’; which returns the amount deposited in that particular bank. Call the method
‘getBalance’by the object of each of the three banks.*/

package inheritbank;
import java.util.Scanner;
/**
 *
 * @author divya
 */
public class Inheritbank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 1 for bankA amount");
        System.out.println("enter 2 for bankB amount");
        System.out.println("enter 3 for bankc amount");
        int n=obj.nextInt();
        switch (n)
         {
        case 1:    
        bankA obj1=new bankA();
        System.out.println(obj1.getbalance());
        break;
        case 2:
        bankB obj2=new bankB();
        System.out.println(obj2.getbalance());
        break;
        case 3:
        bankC obj3=new bankC();
        System.out.println(obj3.getbalance());
        break;
        default:
        bank ba=new bank();   
        System.out.println(ba.getbalance());  
        }
    }
    
}
class bank
{
  int getbalance()
  {
      return 0;
  }
}
class bankA 
{
    public int getbalance()
    {
        return 1000;
    }
}
class bankB 
{
    public int getbalance()
    {
        return 1500;
    }
}
class bankC 
{
   public int getbalance()
    {
     
        return 2000;
    }
}