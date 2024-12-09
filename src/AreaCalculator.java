public class AreaCalculator {
    public static double Area(double radius){
        if (radius < 0) {
            return -1;  // return -1 if radius is negative
        }
        return Math.PI * radius * radius; // Area of Circle formula
    }

    // Method overloading
    public static double Area(double x, double y){
        if ((x < 0) || (y < 0)){
            return -1;  // return -1 if value x or y is negative
        }
        return x * y; // Area of rectangle formula
    }
}

