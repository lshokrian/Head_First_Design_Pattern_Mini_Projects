package meetups.headFirstDataPatterns;

public abstract class PurchaseItem {
    String description = "unknown item";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
