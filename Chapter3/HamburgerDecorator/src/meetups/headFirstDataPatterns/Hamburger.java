package meetups.headFirstDataPatterns;

public abstract class Hamburger {
    String description = "Unknown Hamburger";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
