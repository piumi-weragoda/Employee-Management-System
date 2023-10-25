/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Worker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(EmpFactory.getEmployeeInstance(00001, 12500.00f, empType.TEMPORARY));
        empList.add(EmpFactory.getEmployeeInstance(00005, 122500.00f, empType.PERMENANT));
        empList.add(EmpFactory.getEmployeeInstance(00011, 80000.50f, empType.PERMENANT));
        empList.add(EmpFactory.getEmployeeInstance(00006, 21900.00f, empType.TEMPORARY));
        empList.add(EmpFactory.getEmployeeInstance(00100, 111500.00f, empType.CONTRACT));
        empList.add(EmpFactory.getEmployeeInstance(00050, 350500.77f, empType.CONTRACT));

        Scanner scn = new Scanner(System.in);
        int opt = 1;
        do {
            System.out.println("1 - Display Employee details");
            System.out.println("2 - Search Employees");
            System.out.println("3 - Sort Employees by Id");
            System.out.println("4 - Sort Employees by salary");
            System.out.println("5 - Add new Employees");
            System.out.println("6 - Edit Employees details");
            System.out.println("7 - Remove a Employee");
            System.out.println("8 - Exit");
            System.out.println("Option :");

            opt = scn.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("You have selected option 1 - Display Employee Details");
                    for (Employee e : empList) {
                        System.out.println(e);
                    }
                    break;

                case 2:
                    int index = -1,
                     id;
                    System.out.println("You have selected option 2 - Search Employees");
                    System.out.println("Employee ID : >>");
                    id = scn.nextInt();
                    for (int i = 0; i < empList.size(); i++) {
                        if (id == empList.get(i).getId()) {
                            index = i;
                            break;
                        }
                        if (index != -1) {
                            System.out.println("Employee found : " + empList.get(index));

                        } else {
                            System.out.println("Employee not Found... : ");
                        }
                        break;
                    }
                case 3:
                    System.out.println("You have selected option 3- sort by Employee ID ");
                    Collections.sort(empList, new SortById());
                    for (Employee e : empList) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("You have selected option 4- sort by Employee with salary ");
                    Collections.sort(empList, new SortBySalary());
                    for (Employee e : empList) {
                        System.out.println(e);
                    }
                    break;

                case 5:
                    System.out.println("You have selected option 5- Add an new Employee");
                    System.out.println("Emp ID :>>");
                    id = scn.nextInt();
                    System.out.println("Emp Salary :");
                    float salary = scn.nextFloat();
                    System.out.println("Emp Type: >>\n Contract -1\nPermenant-2\nTemporary-3");
                    int typ = scn.nextInt();

                    switch (typ) {
                        case 1:
                            empList.add(EmpFactory.getEmployeeInstance(id, salary, empType.CONTRACT));
                            break;

                        case 2:
                            empList.add(EmpFactory.getEmployeeInstance(id, salary, empType.PERMENANT));
                            break;
                        case 3:
                            empList.add(EmpFactory.getEmployeeInstance(id, salary, empType.TEMPORARY));
                            break;
                        default:
                            System.out.println("Invalid car type");

                            System.out.println("Emp ID :" + id + "Added.");
                            break;

                    }

            }
        } while (opt != 9);

    }
}
