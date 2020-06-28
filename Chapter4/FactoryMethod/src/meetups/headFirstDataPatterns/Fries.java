package meetups.headFirstDataPatterns;

public class Fries extends PurchaseItem{
    PurchaseItem item;

    public Fries (PurchaseItem item) {
        this.item = item;
    }

    public String getDescription() {
        return item.getDescription() + " with Fries";
    }

    public double cost() {
        return 1.99 + item.cost();
    }
}
