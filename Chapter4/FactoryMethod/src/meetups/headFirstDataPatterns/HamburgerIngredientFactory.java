package meetups.headFirstDataPatterns;

public interface HamburgerIngredientFactory {

    public Bread createBread();
    public Meat createMeat();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Sauce createSauce();
}
