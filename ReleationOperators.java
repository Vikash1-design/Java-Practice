
import java.util.Scanner;

public class ReleationOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the driving license test! Please enter your age: ");
        int age = input.nextInt();
        if (age <= 18) {
            System.out.println("bhai tu license le sakte ho.");
        } else {
            System.out.println("Beta Cycle chalo.");
        }
    }
}