package H_SwitchStatement_Loop;

import java.util.Scanner;

public class Factorial {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number:");
            int number = scanner.nextInt();

            int factorial = 1;

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + number + " is: " + factorial);
            }

            scanner.close();
        }
    }

