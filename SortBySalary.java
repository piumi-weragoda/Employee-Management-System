/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.util.Comparator;

/**
 *
 * @author lenovo
 */
public class SortBySalary implements Comparator<Employee>{
    
    public int compare(Employee o1, Employee o2) {
     
     return (int)(o2.getSalary()-o1.getSalary());
 }  
    
}
