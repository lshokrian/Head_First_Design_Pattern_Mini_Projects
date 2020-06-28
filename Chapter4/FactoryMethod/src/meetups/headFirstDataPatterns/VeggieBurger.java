package meetups.headFirstDataPatterns;

public class VeggieBurger extends Hamburger{
    HamburgerIngredientFactory ingredientFactory;


    public VeggieBurger(HamburgerIngredientFactory ingredientFactory, PurchaseItem item) {
        super(item);
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);;
        bread = ingredientFactory.createBread();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
