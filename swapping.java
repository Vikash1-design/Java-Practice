
import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the swapping program!");
        System.out.println("Enter the value of A!");
        int a = inputScanner.nextInt();
        System.out.println("Enter the value of B!");
        int b = inputScanner.nextInt();
        
        int c = a;
        a = b;
        b = c;

        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
    }
}
}