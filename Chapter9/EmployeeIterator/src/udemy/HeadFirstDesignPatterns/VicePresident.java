package udemy.HeadFirstDesignPatterns;

import java.util.ArrayList;
import java.util.Iterator;

public class VicePresident extends Employee {
    Iterator iterator = null;
    ArrayList vpEmployees = new ArrayList();
    String name;
    String description;
    String group;
    int experienceLevel;

    public VicePresident(String name, String description, String group, int experienceLevel) {
        this.name = name;
        this.description = description;
        this.group = group;
        this.experienceLevel = experienceLevel;
    }

    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(vpEmployees.iterator());
        }
        return iterator;
    }

    public void add(Employee employee){
        vpEmployees.add(employee);
    }

    public void remove(Employee employee){
        vpEmployees.remove(employee);
    }

    public Employee getChild(int i){
        return (Employee)vpEmployees.get(i);
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
        System.out.println("\tEmployee Name: " + getName());
        System.out.println("\tDescription: " + getDescription() + " Vice President");
        System.out.println("\tGroup: " + getGroup());
        System.out.println("\tNumber of Direct Employees: " + vpEmployees.size());
        System.out.println("\tExperience level: " + getGroup() + " years");

        Iterator iterator = vpEmployees.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            employee.print();
        }
    }

}
