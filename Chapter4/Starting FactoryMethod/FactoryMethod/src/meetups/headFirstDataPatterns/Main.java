package meetups.headFirstDataPatterns;

public class Main {

    public static void main(String[] args) {
        HamburgerStore nyStore = new NewYorkHamburgerStore();
        HamburgerStore utahStore = new UtahHamburgerStore();

        Hamburger burger1 = nyStore.orderHamburger("beef");
        System.out.println("Person1 ordered " + burger1);

        burger1 = utahStore.orderHamburger("beef");
        System.out.println("Person2 ordered " + burger1);

        burger1 = nyStore.orderHamburger("veggie");
        System.out.println("Person3 ordered " + burger1);

        burger1 = utahStore.orderHamburger("veggie");
        System.out.println("Person4 ordered " + burger1);
    }
}
