package meetups.headFirstDataPatterns;

public abstract class HamburgerStore {

    protected abstract Hamburger createBurger(String item);

    public Hamburger orderHamburger(String type) {
        Hamburger burger = createBurger(type);
        System.out.println("--- Making a " + burger.getName() + " ---");
       //System.out.println("--- Making a " + burger.getName() + " ---");
       burger.grill();
       burger.prepare();
       burger.wrap();
        return burger;
    }

}
