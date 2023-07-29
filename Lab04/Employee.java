package com.mycompany.practical3_exercise3_1;
public class Employee {
    private int age;
    private String name;
    private float salary;    
    public Employee(String name, int age, float salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }   
    
    public int getage(){
        return age;
    }
    
    public void setage(int age){
        this.age = age;
    }
    
    public String getname(){
        return name;
    }  
    
    public void setname(String name){
        this.name = name;
    }
    
    public float getsalary(){
        return salary;
    }
    
    public void setsalary(float salary){
        this.salary = salary;
    }
    
    public void test(){
        
    }
    
}
