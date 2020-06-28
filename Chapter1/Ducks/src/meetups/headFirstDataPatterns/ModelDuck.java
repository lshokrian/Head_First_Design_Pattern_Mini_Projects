package meetups.headFirstDataPatterns;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
        migrateBehavior = new MigrateNever();
        nameOfDuck = "Model";
    }

    public void display() {
        System.out.println("I'm a model duck.");
    }
}
