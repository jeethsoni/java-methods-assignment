public class SpeedConverter {
    public static long toMilesPerHour(double kilometerPerHour){
        // Converting kilometers to meters
        long conversion = Math.round(0.62137 * kilometerPerHour);
        return conversion;
    }

    public static void printConversion(double kilometerPerHour){
        // Checking if kilometer is negative or not
        if (kilometerPerHour < 0){
            System.out.println("Kilometers cannot be negative");
        }else{
            long milesPerHour = toMilesPerHour(kilometerPerHour); // returned value of function
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour  + " mi/h");  // printing the results
        }

    }
}