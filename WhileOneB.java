public class WhileOneB {
    public static void main(String[] args) {

        int x = 100;

        //  Because x is greater than 10, the following will not execute.
        while (x < 10) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println("\n");

    }
}