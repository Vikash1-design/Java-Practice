
import java.util.Scanner;

public class  calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the vikash calculator");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
        int sub = a - b;
        System.out.println("Subtraction: " + sub);
        int mul = a * b;
        System.out.println("Multiplication: " + mul);
        int div = a / b;
        System.out.println("Division: " + div);
        string result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + a + " is " + result);
    }
    
}
