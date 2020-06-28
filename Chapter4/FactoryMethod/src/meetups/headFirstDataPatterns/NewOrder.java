package meetups.headFirstDataPatterns;

public class NewOrder extends PurchaseItem{

    public NewOrder() {
        description = "Order is: ";
    }

    public double cost() {
        return 0.0;
    }
}
