package meetups.headFirstDataPatterns;

public class BeefBurger extends Hamburger{
    HamburgerIngredientFactory ingredientFactory;

    public BeefBurger(HamburgerIngredientFactory ingredientFactory) {
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
