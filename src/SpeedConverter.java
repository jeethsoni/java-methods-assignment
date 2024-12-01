public class SpeedConverter {
    public static long toMilesPerHour(double kilometerPerHour){
            long conversion = Math.round(0.62137 * kilometerPerHour);
            return conversion;
    }

    public static void printConversion(double kilometerPerHour){
        if (kilometerPerHour < 0){
            System.out.println("Kilometers cannot be negative");
        }else{
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour  + " mi/h");
        }

    }
}