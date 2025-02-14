//Code by Cole Miller

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        System.out.println("This program will tell you if the number you enter is prime or not.");
        System.out.println("You can enter 0 anytime to stop the program.");

        System.out.println("Please enter a number: ");
        int n = input.nextInt();

        //Loops until 0 is entered
        while (n != 0) {
            if (isPrime(n)) {
                System.out.println(n + " is prime.");
            } else {
                System.out.println(n + " is not prime.");
            }

            System.out.println("Please enter a number: ");
            n = input.nextInt();
        }

        System.out.println("0 is not prime.");
        
        input.close();
    }

    //Class checks if variable is prime or not and returns a value corresponding
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
