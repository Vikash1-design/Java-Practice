import java.util.Scanner;
public class vegetrian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Are you a vegetarian? (yes/no): ");
        String response = scanner.nextLine();
        boolean isVegetarian = response.equalsIgnoreCase("yes");
        if (isVegetarian) {
            System.out.println("Hello " + name + "! You are a vegetarian.");
        } else {
           System.out.println("Hello " + name + "! You are not a vegetarian.");
           System.out.println("You are not a vegetarian but we respect your choice and hope you have a great day!");
           System.out.println("Thank you for your response, we respect your choice and hope you have a great day!");
        }
       
       
    }
}






    
    

