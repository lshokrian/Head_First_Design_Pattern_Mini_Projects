package meetups.headFirstDataPatterns;

public class Onion extends CondimentDecorator {
    Hamburger burger;

    public Onion (Hamburger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Onion";
    }

    public double cost() {
        return .10 + burger.cost();
    }
}
