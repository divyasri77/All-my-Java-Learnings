/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linecount;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author divya
 */
public class Linecount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        DataInputStream obj=new DataInputStream(System.in);
        System.out.println("enter only the files with extension in single line");
        String n=obj.readLine();          //getting the multiple files in single line
      
        int read;int count=0;
        String[] parts = n.split(" ");    //spliting the file 
            for (String i : parts) {
                System.out.println(i);
              try(FileInputStream fd=new FileInputStream("i")) //accessing the first file
              {
            while((read=fd.read())!=-1)
           {
            if((char)read=='\n')
            {
                count++;               //counting number of lines
            }   
          
        }
         System.out.println(count);      //printing the number of lines
          fd.close();
    } 
              catch(FileNotFoundException e)   //to catch the error
              {
                  System.out.println(e);
              }
         }         
        
    }
}

