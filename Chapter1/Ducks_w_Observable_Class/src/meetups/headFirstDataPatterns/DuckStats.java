package meetups.headFirstDataPatterns;

import javax.security.auth.Subject;
import java.io.ObjectStreamClass;
import java.util.Observable;
import java.util.Observer;

public class DuckStats implements Observer, DisplayStats {
    Observable observable;
    private int quackStat;
    private String currentSeason;
    //private Duck currentDuck;

    public DuckStats(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof Duck) {
            Duck duck = (Duck) obs;
            quackStat = duck.getNumberOfQuacks();
            currentSeason = duck.getCurrentSeason();
            display();
        }
    }

    public void display() {
        System.out.println("The " + ((Duck) observable).getName() + " has done "  + quackStat + " quacks so far.");
        ((Duck) observable).migrateBehavior.migrate(currentSeason);
    }

}
