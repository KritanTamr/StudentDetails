/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentarrayobjects;

/**
 *
 * @author varkr
 */
public class Instructor {
    
    private String name; 
    private float salary; 
    
    Instructor() {}
    
    Instructor(String name, float salary) {
        this.name = name; 
        this.salary = salary; 
    }
    
    public void setName(String name) {
        this.name = name; 
    }
    
    public void setSalary(float salary) {
        this.salary = salary; 
    } 
    
    public String getName(){
        return this.name; 
    }
    
    public float getSalary() {
        return this.salary; 
    
}
