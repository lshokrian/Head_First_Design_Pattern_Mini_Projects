package udemy.HeadFirstDesignPatterns;

import java.util.Iterator;

public abstract class Employee {

    public void add(Employee employee) {
        throw new UnsupportedOperationException();
    }

    public void remove(Employee employee) {
        throw new UnsupportedOperationException();
    }

    public Employee getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public String getGroup () {
        throw new UnsupportedOperationException();
    }

    public int getExperienceLevel() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
