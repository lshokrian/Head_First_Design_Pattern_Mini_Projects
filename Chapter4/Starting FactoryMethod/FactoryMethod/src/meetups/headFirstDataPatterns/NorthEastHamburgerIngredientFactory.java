package meetups.headFirstDataPatterns;

public class NorthEastHamburgerIngredientFactory implements HamburgerIngredientFactory{

    public Bread createBread() {
        return new SesameBread();
    }

    public Meat createMeat() {
        return new GroundBeef();
    }

    public Cheese createCheese() {
        return new CheddarCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Lettuce(), new Onion(), new Tomato(), new Pickles()};
        return veggies;
    }

    public Sauce createSauce() {
        return new MayoAndKetchup();
    }
}
