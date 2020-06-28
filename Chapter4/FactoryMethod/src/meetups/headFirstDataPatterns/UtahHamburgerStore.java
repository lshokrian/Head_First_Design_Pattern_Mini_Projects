package meetups.headFirstDataPatterns;

public class UtahHamburgerStore extends HamburgerStore{

    protected Hamburger createBurger(String item, PurchaseItem purchaseItem) {
        Hamburger burger = null;

        HamburgerIngredientFactory ingredientFactory = new SouthWestHamburgerIngredientFactory();

        if (item.equals("beef")) {
            burger = new BeefBurger(ingredientFactory, purchaseItem);
            burger.setName("Utah Style Beef Burger");
        } else if (item.equals("veggie")) {
            burger = new VeggieBurger(ingredientFactory, purchaseItem);
            burger.setName("Utah Style Veggie Burger");
        }
        return burger;
    }
}
