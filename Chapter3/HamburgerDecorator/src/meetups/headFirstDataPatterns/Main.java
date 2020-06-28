package meetups.headFirstDataPatterns;

public class Main {

    public static void main(String[] args) {
        Hamburger beefBurger = new Beef();
        beefBurger = new Meal(beefBurger, "small");
        System.out.printf("%s $%.2f\n",beefBurger.getDescription(), beefBurger.cost());

        Hamburger beefBurger2 = new Beef();
        beefBurger2 = new Meal(beefBurger2, "large");
        System.out.printf("%s $%.2f\n",beefBurger2.getDescription(), beefBurger2.cost());

        Hamburger turkeyBurger = new Turkey();
        turkeyBurger = new Cheese(turkeyBurger);
        turkeyBurger = new Lettuce(turkeyBurger);
        turkeyBurger = new Tomato(turkeyBurger);
        System.out.printf("%s $%.2f\n",turkeyBurger.getDescription(), turkeyBurger.cost());

        Hamburger impossibleBurger = new Impossible();
        impossibleBurger = new Lettuce(impossibleBurger);
        impossibleBurger = new Onion(impossibleBurger);
        impossibleBurger = new Tomato(impossibleBurger);
        impossibleBurger = new Meal(impossibleBurger, "medium");
        System.out.printf("%s $%.2f\n",impossibleBurger.getDescription(), impossibleBurger.cost());

    }
}
