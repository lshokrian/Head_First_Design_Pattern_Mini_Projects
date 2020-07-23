package udemy.HeadFirstDesignPatterns;

import java.util.Iterator;

public class Engineer extends Employee {
    String name;
    String description;
    String group;
    int experienceLevel;

    public Engineer(String name, String description, String group, int experienceLevel) {
        this.name = name;
        this.description = description;
        this.group = group;
        this.experienceLevel = experienceLevel;
    }

    public Iterator createIterator() {
        return new NullIterator();
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
        System.out.println("\t\t\tEmployee Name: " + getName());
        System.out.println("\t\t\tDescription: " + getDescription() + " Engineer");
        System.out.println("\t\t\tGroup: " + getGroup());
        System.out.println("\t\t\tExperience level: " + getGroup() + " years");
    }

}
