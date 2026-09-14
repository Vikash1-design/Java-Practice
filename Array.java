import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        int[] p = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < p.length; i++) {
            System.out.print("Enter a number: ");
            p[i] = scanner.nextInt();

        }
        System.out.println("You entered the following numbers:");
        for(int k = 0; k < p.length; k++) {
            System.out.println(p[k]);
        }
    }

}
