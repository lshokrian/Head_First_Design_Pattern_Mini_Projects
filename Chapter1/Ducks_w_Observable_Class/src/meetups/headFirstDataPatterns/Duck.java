package meetups.headFirstDataPatterns;

import java.util.Observable;

public abstract class Duck extends Observable {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    MigrateBehavior migrateBehavior;

    String nameOfDuck;
    private int numberOfQuacks;
    private String currentSeason = "Summer";

    public Duck() {
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

    public int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    public String getCurrentSeason() {
        return currentSeason;
    }

    public void numOfQuackChanged() {
        setChanged();
        notifyObservers();
    }

    // this isn't exactly a duck thing
    public void changeSeason(String season) {
        currentSeason = season;
        seasonChanged();
    }

    public void seasonChanged() {
        setChanged();
        notifyObservers();
    }

    public String getName() {
        return nameOfDuck;
    }
}
