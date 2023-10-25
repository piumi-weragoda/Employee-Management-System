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
public class EmpFactory {
    
    public static Employee getEmployeeInstance(int Id, float salary, empType type){
        
        switch(type)
        {
            case CONTRACT: return new ContractEmployee(Id,salary,type);
            case TEMPORARY: return new TemporaryEmployee(Id,salary,type);
            default: return new PermenantEmployee(Id,salary,type);
            
        }
    }
    
}
