package meetups.headFirstDataPatterns;

public class NewYorkHamburgerStore extends HamburgerStore{

    protected Hamburger createBurger(String item) {
        Hamburger burger = null;

        HamburgerIngredientFactory ingredientFactory = new NorthEastHamburgerIngredientFactory();

        if (item.equals("beef")) {
            burger = new BeefBurger(ingredientFactory);
            burger.setName("New York Style Turkey Burger");
        } else if (item.equals("veggie")) {
            burger = new VeggieBurger(ingredientFactory);
            burger.setName("New York Style Veggie Burger");
        }
        return burger;
    }
}
