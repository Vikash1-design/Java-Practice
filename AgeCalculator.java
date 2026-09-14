
import java.util.Scanner;



public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
            if (age >= 60) {
                System.out.println("You are a senior citizen.");
            } else if (age >= 20) {
                System.out.println("You are an adult.");
                
            } else {
                System.out.println("You are a child.");
               
            }









    }













    
}
