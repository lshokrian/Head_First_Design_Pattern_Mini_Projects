package meetups.headFirstDataPatterns;

public class Main {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        TootsiePopOwl owl = new TootsiePopOwl();
        Duck owlAdapter = new OwlAdapter(owl);

        System.out.println("The Owl says...");
        owl.howl();
        owl.fly();

        System.out.println("The Duck says...");
        testDuck(duck);

        System.out.println("The Owl Adapter says...");
        testDuck(owlAdapter);
    }

    static public void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
