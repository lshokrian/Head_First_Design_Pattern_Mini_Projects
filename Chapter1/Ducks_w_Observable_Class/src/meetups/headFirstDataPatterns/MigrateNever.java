package meetups.headFirstDataPatterns;

public class MigrateNever implements MigrateBehavior {

    public void migrate(String season){
        System.out.println("I don't migrate.");
    }
}
