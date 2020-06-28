package meetups.headFirstDataPatterns;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        migrateBehavior = new MigrateWinter();
        nameOfDuck = "Mallard";
    }

    public void display() {
        System.out.println("I'm the real " + getName() + " duck.");
    }

}
