package userinteration;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Math.random() - returns 'double' from 0.0 <=  < 1.0
        // 1. generate a random number from 1 to 100
        // 1 <= (int) (Math.random() * 100) + 1 < 101
        int lower = 1;
        int upper = 100;
        int magicNumber = (int) (Math.random() * 100) + 1;

        // 2. create a Scanner object ot get user input
        Scanner in = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left.");
            System.out.println("Try to guess the number from " + lower + " to " + upper + "!");
            // double input = in.nextDouble();
            // String input = in.next();
            // String input = in.nextLine();
            int input = in.nextInt();
            if (input == magicNumber) {
                System.out.println("You are correct!");
                System.out.println("The magic number is " + magicNumber);
                break;
            } else if (magicNumber > input) {
                lower = input + 1;
            } else {
                upper = input - 1;
            }
        }
    }
}
