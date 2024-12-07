public class Main {
    public static void main(String[] args) {
        // checks if number is positive, negative or zero;
        PositiveNegativeZero.checkNumber(5);

        // Convert kilometer to miles
        SpeedConverter.printConversion(-1);

        // Checks if the year is a leap year or non leap year
        boolean isLeap = LeapYearCalculator.isLeapYear(-4000);
        System.out.println(isLeap);

        // Calculates the area (method overloading)
        System.out.println("The area of circle is " + AreaCalculator.Area(4));
        System.out.println("The area of rectangle is " + AreaCalculator.Area(2, 3));
    }
}