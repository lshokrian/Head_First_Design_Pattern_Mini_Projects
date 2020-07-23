package udemy.HeadFirstDesignPatterns;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeListing {
    Employee allEmployees;
    ArrayList employeeList = new ArrayList();
    String name;
    String description;

    public EmployeeListing(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setAllEmployees(Employee allEmployees) {
        this.allEmployees = allEmployees;
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    public Employee getChild(int i) {
        return (Employee)employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Description: " + getDescription() + " Manager");

        Iterator iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            employee.print();
        }
    }

    public void printCustom() {
        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println("CUSTOM: " + getName());
        System.out.println("Employee Name: " + getName());
        System.out.println("Description: " + getDescription() + " Manager");

        Iterator iterator = allEmployees.createIterator();
        while(iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            employee.print();
        }
        System.out.println("**********************************");
        System.out.println("**********************************");
    }

}
