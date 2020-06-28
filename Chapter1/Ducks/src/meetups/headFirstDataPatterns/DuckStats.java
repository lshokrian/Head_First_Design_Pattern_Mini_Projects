package meetups.headFirstDataPatterns;

public class DuckStats implements Observer, DisplayStats {
    private int quackStat;
    private Subject currentSubject;
    private String currentSeason;
    //private Duck currentDuck;

    public void update(Subject sub, int numOfQuacks, String season) {
        if (sub instanceof Duck) {
            currentSubject = sub;
            quackStat = numOfQuacks;
            currentSeason = season.toLowerCase();
            display();
        }
    }

    public void display() {

        System.out.println("The " + ((Duck) currentSubject).getName() + " has done "  + quackStat + " quacks so far.");
        ((Duck) currentSubject).migrateBehavior.migrate(currentSeason);
    }

}
