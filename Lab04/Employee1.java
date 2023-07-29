package com.mycompany.practical3_exercise3_1;

public class Employee1 {
    private String empName;
    private float bonus, basicSal;
    
    public Employee1(float bonus){
        this.bonus = bonus;
    }
    
    public String getname(){
        return empName;
    }
    
    public void setname(String empName){
        this.empName = empName;
    }
    
    public float getbasicsal(){
        return basicSal;
    }
    
    public void setbasicsal(float basicSal){
        this.basicSal = basicSal;
    }
    
    public float getbonus(){
        return bonus;
    }
    
    public float bonusamount(){
        return basicSal + bonus;
    }
}
