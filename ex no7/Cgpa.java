/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa;

/**
 *
 * @author divya
 */
public class Cgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList al=new ArrayList();  
al.add(new Student(90,"Vijay", (float) 9.0));  
al.add(new Student(91,"Ajay", (float) 9.8));  
al.add(new Student(92,"Jai", (float) 9.7)); 
al.add(new Student (93,"Hari", (float) 9.6));
al.add(new Student(90,"Kumar", (float) 9.0));  
al.add(new Student(91,"Vasanth", (float) 9.8));  
al.add(new Student(92,"Ram", (float) 9.7)); 
al.add(new Student (93,"Dinesh", (float) 9.6));
al.add(new Student(90,"Raja", (float) 9.0));  
al.add(new Student(91,"Mahendra", (float) 9.8));  
al.add(new Student(92,"Singh", (float) 9.7)); 
al.add(new Student (93,"Dhoni", (float) 9.6));
al.add(new Student(90,"Virat", (float) 9.0));  
al.add(new Student(91,"Raina", (float) 9.8));  
al.add(new Student(92,"Aakash", (float) 9.7)); 
al.add(new Student (93,"Smith", (float) 9.6));
  

  
System.out.println("Sorting by CGPA");  
  
Collections.sort(al,new CgpaComparator());  
Iterator itr2=al.iterator();  
while(itr2.hasNext()){  
Student st=(Student)itr2.next();  
System.out.println(st.rollno+" "+st.name+" "+st.cgpa);  
}  
  
    }
    
}
class Student{  
int rollno;  
String name;  
float cgpa;  
Student(int rollno,String name,float cgpa){  
this.rollno=rollno;  
this.name=name;  
this.cgpa=cgpa;  
}  
} 

class CgpaComparator implements Comparator{  
@Override
public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
if(s1.cgpa==s2.cgpa)  
return 0;  
else if(s1.cgpa>s2.cgpa)  
return 1;  
else  
return -1;  
}  
}  