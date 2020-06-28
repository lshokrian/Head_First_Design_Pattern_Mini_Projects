package meetups.headFirstDataPatterns;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        DuckStats duckMallardQuackStats= new DuckStats();
        mallard.registerObserver(duckMallardQuackStats);

        mallard.changeSeason("Fall");
        mallard.performQuack();
        mallard.performFly();

        mallard.performQuack();
        mallard.changeSeason("Winter");
        mallard.changeSeason("Spring");
        //mallard.removeObserver(duckQuackStats);
        mallard.performQuack();
        mallard.changeSeason("Summer");

        Duck model = new ModelDuck();
        DuckStats duckModelQuackStats= new DuckStats();
        model.registerObserver(duckModelQuackStats);
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.changeSeason("Spring");
        model.performQuack();


    }
}
