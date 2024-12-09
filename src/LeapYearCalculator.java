public class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        if (year <= 0){
            return false;  // return false if year is negative
        }

        // Nested If statements
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;

    }
}