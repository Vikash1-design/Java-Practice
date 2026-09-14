
import java.awt.im.InputContext;
import java.util.Scanner;

public class assignment {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("welcome to swapping of two numbers");
        System.out.print("enter the Value of A");
        int A = sc.nextInt();
        System.out.print("enter the Value of B");
        int B = sc.nextInt();
        int temp = A;
        A = B;
        B = temp;
        System.out.println("After swapping: A = " + A + ", B = " + B);
    }
}      