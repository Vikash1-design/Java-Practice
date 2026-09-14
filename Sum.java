
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to the Vikash calculator!");
        System.out.print("Enter first number: ");
        int FirstNumber = inputScanner.nextInt();  // Read user input
        System.out.print("Enter second number: ");
        int SecondNumber= inputScanner.nextInt();  // Read user input


        int Sum = FirstNumber + SecondNumber;
        System.out.println("The sum is: " + Sum);  // Output user input
        System.out.println("Thank you for using the sum calculator!");
        System.out.println("Have a great day!");
        Source: https://www.geeksforgeeks.org/java-program-to-calculate-sum-of-two-numbers/ 
    }
}
