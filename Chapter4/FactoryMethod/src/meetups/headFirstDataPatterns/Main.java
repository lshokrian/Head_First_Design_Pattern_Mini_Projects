package meetups.headFirstDataPatterns;

public class Main {

    public static void main(String[] args) {
        HamburgerStore nyStore = new NewYorkHamburgerStore();
        HamburgerStore utahStore = new UtahHamburgerStore();

        PurchaseItem order1 = new NewOrder();
        Hamburger burger1 = nyStore.orderHamburger("beef", order1);
        order1 = burger1;
        order1 = new Fries(order1);
        order1 = new Drink(order1);
        System.out.println("Person1 ordered " + burger1);
        System.out.printf("Person1 ordered - decorator: %s $%.2f\n", order1.getDescription(), order1.cost());
        System.out.println("\n");

        PurchaseItem order2 = new NewOrder();
        burger1 = utahStore.orderHamburger("beef", order2);
        order2 = burger1;
        order2 = new Fries(order2);
        System.out.println("Person2 ordered " + burger1);
        System.out.printf("Person2 ordered - decorator: %s $%.2f\n", order2.getDescription(), order2.cost());
        System.out.println("\n");

        PurchaseItem order3 = new NewOrder();
        burger1 = nyStore.orderHamburger("veggie", order3);
        order3 = burger1;
        order3 = new Drink(order3);
        System.out.println("Person3 ordered " + burger1);
        System.out.printf("Person3 ordered - decorator: %s $%.2f\n", order3.getDescription(), order3.cost());
        System.out.println("\n");

        PurchaseItem order4 = new NewOrder();
        burger1 = utahStore.orderHamburger("veggie", order4);
        System.out.println("Person4 ordered " + burger1);
        System.out.printf("Person4 ordered - decorator: %s $%.2f\n", order4.getDescription(), order4.cost());
        System.out.println("\n");

    }
}
