/*Define an abstract class “car” with members reg_no, model, reg_date. Define two
subclasses of this class – “transportVehicles ” (validity_no, start_date, period) and
“privateVehicle ” (owner_name, owner_address). Define appropriate constructors. Create
n objects which could be of either transportVehicles or privateVehicle class by asking the
user’s choice. Display details of all “privateVehicle” objects and all “transportVehicles”
objects.

 */
package pkgabstract;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class abstractvehicle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner (System.in);
               System.out.println("for transportvehicle enter 1");
               System.out.println("for privatevehicle enter 2");
              
               int ch=obj.nextInt();
               switch (ch)
                {
                  case 1:
                   System.out.println("enter the total number of transport vehicle");
                   int n=obj.nextInt();
                   transportvehicles a[]=new transportvehicles[n];
                   double validity_no;double start_date;int period; 
                   for (int i = 0; i < n; i++) {
                     System.out.println("\nenter the details for transport vehicle"+(i+1));
                     System.out.println("\nenter the validity_no:");
                     validity_no=obj.nextDouble();
                     System.out.println("enter the start date");
                     start_date=obj.nextDouble();
                     System.out.println("enter the period");
                     period=obj.nextInt();
                    
                   car obj1=new transportvehicles(validity_no,start_date,period);
                   obj1.display();
                   obj1.getdata1();
                   }
                   break;
                   
    
                   case 2:
                   
                     System.out.println("enter the total number of private vehicle");
                     int n1=obj.nextInt();
                     privatevehicle a1[]=new privatevehicle[n1];
                     String ow_name;String ow_address;
                     for (int i = 0; i < n1; i++) {
                     System.out.println("enter the details for private vehicle"+(i+1));
                     System.out.println("enter the owner name:");
                     ow_name=obj.next();
                     System.out.println("enter the owner address");
                     ow_address=obj.next();  
                     
                     car obj1=new privatevehicle(ow_name,ow_address);
                     obj1.display();
                     obj1.getdata1();
                     }
                     break;
                     
                    
                     default:
                      
                         System.out.println("enter the correct input");
                
               }
               }
    }

abstract class car
{
    
    int reg_no;
    String model;
    double reg_date;
  
    public void display()
    {
          Scanner obj2=new Scanner(System.in);
          System.out.println("enter register number:");
          reg_no=obj2.nextInt();
          System.out.println("enter the model of the vehicle:");
          model=obj2.next();
          System.out.println("enter the registered month and year in (x.yyyy)format:");
          reg_date=obj2.nextDouble();
          System.out.println("\nregister number:"+ reg_no+"\nmodel:"+ model+"\nreg_date:"+ reg_date);
    }
    
    abstract public void getdata1();
             
}
class transportvehicles extends car
{
  
   double validity_no;
   double start_date;
   int period; 
   transportvehicles(double vn,double sd,int p)
   {
       validity_no=vn;
       start_date=sd;
       period=p;
   }
   public void getdata1()
   {
       System.out.println("validity_no:"+validity_no);
       System.out.println("start_date:"+start_date);
       System.out.println("period:"+period);
   }
   
   
}
 class privatevehicle extends car
{
    String ow_name;
    String ow_address;
    privatevehicle(String own,String owad)
    {
      ow_name=own;
      ow_address=owad;
    }
    public void getdata1()
    {
        System.out.println("owner name:"+ ow_name);
        System.out.println("owner address:"+ ow_address);
    }
   
}