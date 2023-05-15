/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentarrayobjects;

/**
 *
 * @author varkr
 */
public class StudentArrayObjects {

    /**
     * s1: initialize versioning, .gitconfig, .gitignore, commit 
     * user interaction - View Class -> Main Method. -> I/O Operations only. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student[] s = new Student[3];
        
        Student s1 = new Student(); 
        s1.setName("First");
        s1.setAge(21);
        
        Student s2 = new Student(); 
        s2.setName("Second");
        s2.setAge(18);
        
        Student s3 = new Student(); 
        s3.setName("Third");
        s3.setAge(32);
        
        s[0] = s1; 
        s[1] = s2; 
        s[2] = s3; 
        
        for (int i = 0; i < 3; i++) {
            String name = s[i].getName(); 
            int age = s[i].getAge(); 
            System.out.println(name); 
            System.out.println(age); 
        }
        
    }
    
}
