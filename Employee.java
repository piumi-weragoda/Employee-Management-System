/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author lenovo
 */

enum empType{PERMENANT,TEMPORARY,CONTRACT}

public class Employee {
    
    private int Id;
    private float salary;
    private empType type;

    public Employee(int Id, float salary, empType type) {
        this.Id = Id;
        this.salary = salary;
        this.type = type;
    }

    public empType getType() {
        return type;
    }

    public void setType(empType type) {
        this.type = type;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID :" + Id + "Salary :" + salary + "Type :" + type;
    }
    
    @Override
     public boolean equals(Object obj){
        if(obj instanceof Employee)
        {
            Employee e =(Employee)obj;
            if (Id == e.Id)
                return true;
        }
        return false;
    }
    
    
    
}
