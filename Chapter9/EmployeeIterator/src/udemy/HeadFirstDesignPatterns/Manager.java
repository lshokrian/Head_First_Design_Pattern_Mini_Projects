package udemy.HeadFirstDesignPatterns;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager extends Employee {
    Iterator iterator = null;
    ArrayList managerEmployees = new ArrayList();
    String name;
    String description;
    String group;
    int experienceLevel;

    public Manager(String name, String description, String group, int experienceLevel) {
        this.name = name;
        this.description = description;
        this.group = group;
        this.experienceLevel = experienceLevel;
    }

    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(managerEmployees.iterator());
        }
        return iterator;
    }

    public void add(Employee employee) {
        managerEmployees.add(employee);
    }

    public void remove(Employee employee) {
        managerEmployees.remove(employee);
    }

    public Employee getChild(int i) {
        return (Employee)managerEmployees.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getGroup() {
        return group;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void print() {
        System.out.println("\t\tEmployee Name: " + getName());
        System.out.println("\t\tDescription: " + getDescription() + " Manager");
        System.out.println("\t\tGroup: " + getGroup());
        System.out.println("\t\tNumber of Direct Employees: " + managerEmployees.size());
        System.out.println("\t\tExperience level: " + getGroup() + " years");

        Iterator iterator = managerEmployees.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            employee.print();
        }
    }

}
