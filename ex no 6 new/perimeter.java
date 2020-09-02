
package pkginterface;

/**
 *
 * @author divya
 */
public class perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rectangle obj=new rectangle();
        int length=10;
        int breadth=5;
        int radius=6;
        System.out.println("area of the rectangle"+obj.area(length,breadth));
        System.out.println("perimeter of the rectangle"+obj.perimeter(length,breadth));
        
        resizable obj1=new rectangle();
        obj1.resize();
        
        circle obj2=new circle();
        System.out.println("\narea of the circle"+obj2.area(radius));
        System.out.println("perimeter of circle"+obj2.perimeter(radius));
        obj2.resize();
        
        
    }
    
}
interface resizable
{
     int l1=5,b1=5;
     int r1=10;
     void  resize();       
}
class rectangle implements resizable
{
   public int area(int l,int b)
   {
    return l*b;
   }
  public int perimeter(int l,int b)
   {
       return 2*(l+b);
   }
  public void resize()
  {
      System.out.println("resized area:"+l1*b1);
      System.out.println("resized perimeter:"+(2*(l1+b1)));
  }
}
class circle implements resizable
{
    public double area(int r)
    {
        return (3.14*r);
    }
    public double perimeter(int r)
    {
        return (2*3.14*r);
    }
    public void resize()
    {
       System.out.println("resized area:"+(3.14*r1));
      System.out.println("resized perimeter:"+(2*3.14*r1));
    }
}