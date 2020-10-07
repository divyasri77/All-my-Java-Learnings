/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charstreamdemo.stream;

import java.io.File;

/**
 *
 * @author divya
 */
public class canerw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f=new File("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\charstreamdemo\\src\\charstreamdemo\\stream\\two");
        System.out.println("Name-->"+f.getName());
        System.out.println("File path-->"+f.getParent());
        System.out.println("File path-->"+f.getPath());
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        String name[]=f.list();// get all files under this directory/folder
        System.out.println("No of files--->"+name.length);
        for(String fname:name)
            System.out.println(fname);
        //System.out.println(f.length());
        f.setExecutable(false);
        System.out.println(f.canExecute());
        f.setReadable(false);
        System.out.println(f.canRead());
        f.setWritable(true);
        System.out.println(f.canWrite());
        
          
    }
    
}
