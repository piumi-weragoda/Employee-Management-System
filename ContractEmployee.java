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
public class ContractEmployee extends Employee{

    public ContractEmployee(int Id, float salary, empType type) {
        super(Id, salary, type);
    }
    
    public void display(){
        
        System.out.println("Contrac basic Employee..");
    }
    
}
