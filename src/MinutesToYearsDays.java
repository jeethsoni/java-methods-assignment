public class MinutesToYearsDays {
    public static void printYearsAndDays(long mintues){
        if (mintues <= 0){
            System.out.println("Minutes cannot be negative or zero");
        }

        long year = mintues / 525600;
        long remainingMinutes = mintues % 525600;
        long day = remainingMinutes / 1440;

        System.out.println((mintues + "minutes is " + year + " years and " + day + " days"));
    }
}
