package meetups.headFirstDataPatterns;

public abstract class HamburgerStore {

    protected abstract Hamburger createBurger(String item, PurchaseItem purchaseItem);

    public Hamburger orderHamburger(String type, PurchaseItem purchaseItem) {
        Hamburger burger = createBurger(type, purchaseItem);
        System.out.println("--- Making a " + burger.getName() + " ---");
       burger.grill();
       burger.prepare();
       burger.wrap();
        return burger;
    }

}
