package meetups.headFirstDataPatterns;

public class Tomato extends Hamburger {
    Hamburger burger;

    public Tomato(Hamburger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Tomato";
    }

    public double cost() {
        return .50 + burger.cost();
    }
}
