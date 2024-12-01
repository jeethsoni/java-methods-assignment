public class PositiveNegativeZero {

    //Checks if the number is positive, negative or zero
    public static void checkNumber (int number){
        if (number < 0){
            System.out.println("The number is Negative");
        } else if (number > 0) {
            System.out.println("The number is Positive");
        }else{
            System.out.println("The number is Zero");
        }
    }
}
