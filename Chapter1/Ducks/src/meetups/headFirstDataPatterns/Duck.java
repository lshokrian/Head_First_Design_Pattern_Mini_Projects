package meetups.headFirstDataPatterns;

import java.util.ArrayList;
import java.util.List;

public abstract class Duck implements Subject {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    MigrateBehavior migrateBehavior;

    String nameOfDuck;
    private int numberOfQuacks;
    private String currentSeason = "Summer";
    private List<Observer> observers;

    public Duck() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(this, numberOfQuacks, currentSeason);
        }
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setMigrateBehavior(MigrateBehavior migrateBehavior) {
        this.migrateBehavior = migrateBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
        numberOfQuacks++;
        numOfQuackChanged();
    }

    public void numOfQuackChanged() {
        notifyObservers();
    }

    // this isn't exactly a duck thing
    public void changeSeason(String season) {
        currentSeason = season;
        seasonChanged();
    }

    public void seasonChanged() {
        notifyObservers();
    }

    public String getName() {
        return nameOfDuck;
    }
}
