package meetups.headFirstDataPatterns;

public class Drink extends CondimentDecorator {
    PurchaseItem item;

    public Drink (PurchaseItem item) {
        this.item = item;
    }

    public String getDescription() {
        return this.item.getDescription() + " with a Drink";
    }

    public double cost() {
        return 1.49 + this.item.cost();
    }
}
