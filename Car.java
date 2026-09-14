import java.util.Scanner;
public class Car {
    public static void main(String[] args) {
        System.out.print("Welcome to  the the maximum speed calculator   ");
        Scanner scanner = new Scanner(System.in);
        int  speed = scanner.nextInt();
        System.out.println("You entered: " + speed);
        if (speed < 200) {
            System.out.print("Pllz speed kam kizeye: " + speed + " mph"); {
                if (speed > 200) {
                    System.out.println("You are exceeding the speed limit. Please slow down.");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a number greater than 200.");
            }
      
        }
    }
