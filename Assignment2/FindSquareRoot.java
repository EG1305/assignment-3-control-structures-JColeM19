//Code by Cole Miller

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.println("The program will find the square root of a number");
        System.out.print("Enter a positive integer: ");
        double n = input.nextDouble();

        double lastGuess = 1.0; 
        double nextGuess = (lastGuess + n / lastGuess) / 2;
        int iterations = 0;

        //Loops until the guess doesn't change
        while (nextGuess != lastGuess) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
            iterations++;
        }

        System.out.println("The square root of " + n + " is " + nextGuess);
        System.out.println("The program found the result in " + iterations + " iterations.");
        
        input.close();
    }
}
