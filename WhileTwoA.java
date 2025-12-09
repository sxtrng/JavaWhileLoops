import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingValue;
        int endingValue;
        int increment;

        System.out.print("Enter starting value: ");
        startingValue = scanner.nextInt();

        System.out.print("Enter ending value: ");
        endingValue = scanner.nextInt();

        System.out.print("Enter number to increment by: ");
        increment = scanner.nextInt();

        System.out.printf
        (
            "\nYou will begin counting at %d, stop counting at %d, and increment by %d.",
            startingValue, endingValue, increment
        );

        System.out.println("\n");

        while (startingValue <= endingValue) {
            System.out.print(startingValue + " ");
            startingValue += increment;
        }



        System.out.println("\n");

        scanner.close();
    }
}