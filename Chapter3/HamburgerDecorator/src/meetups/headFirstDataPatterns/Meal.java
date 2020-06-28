package meetups.headFirstDataPatterns;

public class Meal extends CondimentDecorator {
    Hamburger burger;
    String size;

    public Meal(Hamburger burger, String size) {
        this.burger = burger;
        // use enum instead of string
        this.size = size.toLowerCase();
    }

    public String getDescription() {
        if (size.equals("small")) {
            return burger.getDescription() + ", Small Fries and Small Soda";
        } else if (size.equals("medium")) {
            return burger.getDescription() + ", Medium Fries and Medium Soda";
        } else if (size.equals("large")) {
            return burger.getDescription() + ", Large Fries and Large Soda";
        } else {
            return "error";
        }
    }

    public double cost() {
        if (size.equals("small")) {
            return 1.50 + burger.cost();
        } else if (size.equals("medium")) {
            return 2.00 + burger.cost();
        } else if (size.equals("large")) {
            return 2.25 + burger.cost();
        } else {
            return 0;
        }
    }
}
