public class AreaCalculator {
    public static double Area(double radius){
        if (radius < 0) {
            return -1;
        }
        return Math.PI * radius * radius;
    }

    // Method overloading
    public static double Area(double x, double y){
        if ((x < 0) || (y < 0)){
            return -1;
        }
        return x * y;
    }
}

