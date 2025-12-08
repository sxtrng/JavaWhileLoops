import java.util.Scanner;

public class WhileOneC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program counts from a user-defined starting value until it reaches a user-defined ending value.");
        System.out.println("Rather than counting by ones, the user will also enter a value to increment by.");

        int startingValue ;
        int endingValue;
        int increment;

        System.out.print("Enter starting value: ");
        startingValue = scanner.nextInt();

        System.out.print("Enter an ending value: ");
        endingValue = scanner.nextInt();

        System.out.print("Enter a value to count by: (1s, 2s, 3s....etc.): ");
        increment = scanner.nextInt();

        while (startingValue < endingValue) {
            System.out.print(startingValue + " ");
            startingValue += increment;
        }

        System.out.println("\n");

    }
}