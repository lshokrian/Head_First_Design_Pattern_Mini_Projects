package udemy.HeadFirstDesignPatterns;

public class Main {

    public static void main(String[] args) {
        Employee engineer1 = new Engineer("Billy Bob", "Nerdy", "Apple", 4);
        Employee engineer2 = new Engineer("Sandy Sally", "Chill", "Beach.com", 7);
        Employee engineer3 = new Engineer("Crawl Crawly", "Talkative", "TMobile", 3);
        Employee engineer4 = new Engineer("Tingy Tangy", "Sassy", "TMobile", 5);

        Employee manager1 = new Manager("Vish Vash", "Quiet", "Beach.com", 2);
        Employee manager2 = new Manager("Krispy Krab", "Sarcastic", "Beach.com", 1);
        Employee manager3 = new Manager("Woppy Wopper", "Hungry", "TMobile", 4);
        Employee manager4 = new Manager("Angie Angery", "Angry", "Facebook", 6);
        Employee manager5 = new Manager("Madie Magoo", "Mopey", "Apple", 8);

        Employee vicePresident1 = new VicePresident("Pew Pewder", "Bossy", "Beach.com", 5);
        Employee vicePresident2 = new VicePresident("Diggy Dag", "Braniac", "TMobile", 1);
        Employee vicePresident3 = new VicePresident("Fudge Flinstone", "Tough", "Apple", 9);
        Employee vicePresident4 = new VicePresident("Newton Nugget", "Awkward", "Facebook", 7);

        //System.out.println("Add Managers to VP");
        vicePresident1.add(manager1);
        vicePresident1.add(manager2);

        vicePresident2.add(manager3);

        vicePresident3.add(manager5);

        vicePresident4.add(manager4);

        //System.out.println("Add Engineers to Managers");
        manager1.add(engineer2);
        manager2.add(engineer2);

        manager3.add(engineer3);
        manager3.add(engineer4);

        manager5.add(engineer1);

       EmployeeListing employeeListing = new EmployeeListing("Koo Koo Tech Companies", "Employee Listing");
       employeeListing.add(vicePresident1);
       employeeListing.add(vicePresident2);
       employeeListing.add(vicePresident3);
       employeeListing.add(vicePresident4);
       employeeListing.print();

       Employee allEmployees = new VicePresident("All VPs", "What am I doing", "Random", 1);
       allEmployees.add(vicePresident1);
        allEmployees.add(vicePresident2);
        allEmployees.add(vicePresident3);
        allEmployees.add(vicePresident4);
       employeeListing.setAllEmployees(allEmployees);
       employeeListing.printCustom();
    }
}
