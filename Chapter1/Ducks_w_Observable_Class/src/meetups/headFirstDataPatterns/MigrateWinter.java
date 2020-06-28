package meetups.headFirstDataPatterns;

public class MigrateWinter implements MigrateBehavior{
    public String currentSeason = "summer";

    public void migrate(String season) {
        //System.out.println("season: " + season + " and currentSeason = " + currentSeason);
        if (season != null) {
            season = season.toLowerCase();
            if (!season.equals(currentSeason)) {
                switch(season) {
                    case "spring":
                        System.out.println("It's now Spring. Time to fly north and have babies duckies!");
                        break;
                    case "summer":
                        System.out.println("It's now Summer. Happy where I am right now.");
                        break;
                    case "fall":
                        System.out.println("It's now Fall. Time to fly south for warmer weather!");
                        break;
                    case "winter":
                        System.out.println("It's Winter. Happy where I am right now, it's too cold up north!");
                        break;
                    default:
                        System.out.println("Error: no proper season was provided.");
                        break;
                }
                currentSeason = season;

            }
        }
    }

}
