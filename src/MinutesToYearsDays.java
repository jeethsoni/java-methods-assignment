public class MinutesToYearsDays {
    public static void printYearsAndDays(long minutes){

        // checking if minutes is negative
        if (minutes <= 0){
            System.out.println("Minutes cannot be negative or zero");
        }

        // Formula to calculate years and days
        long year = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long day = remainingMinutes / 1440;

        System.out.println((minutes + "minutes is " + year + " years and " + day + " days"));
    }
}
