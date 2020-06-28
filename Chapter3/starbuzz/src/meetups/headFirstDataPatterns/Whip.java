package meetups.headFirstDataPatterns;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
