package meetups.headFirstDataPatterns;

public class Cheese extends CondimentDecorator {
    Hamburger burger;

    public Cheese(Hamburger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Cheese";
    }

    public double cost() {
        return .75 + burger.cost();
    }
}
