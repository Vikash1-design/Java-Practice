import java.util.Scanner;
public class main {}
    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Table Generator!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        printMultiplicationTable(number);
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
           
    }

