package meetups.headFirstDataPatterns;

public class Lettuce extends CondimentDecorator {
    Hamburger burger;

    public Lettuce (Hamburger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Lettuce";
    }

    public double cost() {
        return .10 + burger.cost();
    }
}
