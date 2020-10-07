/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamdemo.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author divya
 */
public class charstreambyte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream fis=null;
          FileOutputStream fos=null;
          FileReader fr=null;
            FileWriter fw=null;
            fis=new FileInputStream("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\charstreamdemo\\src\\charstreamdemo\\stream\\1-title.jpg");
            fos=new FileOutputStream("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\charstreamdemo\\src\\charstreamdemo\\stream\\samp2.jpg");
            int i;
            while((i=fis.read())!=-1)
            {
                fos.write(i);
            }
            fos.close();
            fr=new FileReader("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\charstreamdemo\\src\\charstreamdemo\\stream\\1-title.jpg");
            fw=new FileWriter("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\charstreamdemo\\src\\charstreamdemo\\stream\\samp3");
            int j;
            while((j=fr.read())!=-1)
            {
                fw.write(j);
            }
            fw.close();
    }
}
        
    
    

