
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        if (number < 0) {
            System.out.println("Error: Cannot calculate the square root of a negative number.");
        } else {
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + squareRoot);
        }
    }
}