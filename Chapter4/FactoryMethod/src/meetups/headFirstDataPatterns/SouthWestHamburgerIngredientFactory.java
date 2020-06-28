package meetups.headFirstDataPatterns;

public class SouthWestHamburgerIngredientFactory implements HamburgerIngredientFactory {
    public Bread createBread() {
        return new PotatoBread();
    }

    public Meat createMeat() {
        return new ShreddedSteak();
    }

    public Cheese createCheese() {
        return new PepperJackCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Avocado(), new Onion(), new Tomato(), new Cilantro()};
        return veggies;
    }

    public Sauce createSauce() {
        return new ChipotleSauce();
    }
}
