package meetups.headFirstDataPatterns;

import javax.print.attribute.standard.PrinterURI;

public class BeefBurger extends Hamburger{
    HamburgerIngredientFactory ingredientFactory;
    PurchaseItem item;

    public BeefBurger(HamburgerIngredientFactory ingredientFactory, PurchaseItem item) {
        super(item);
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        bread = ingredientFactory.createBread();
        cheese = ingredientFactory.createCheese();
        meat = ingredientFactory.createMeat();
    }

    public double cost() {
        return 2.75;
    }
}
