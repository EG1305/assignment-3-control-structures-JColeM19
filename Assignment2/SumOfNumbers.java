//Code by Cole Miller

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("This program will add all the numbers from 1 to the number you enter.");
		System.out.println("Please enter a number.");
		int n = input.nextInt();
		System.out.println("You entered " + n);
		
		
		//Adds up all the numbers from 1 to the specified number
		for (int i = 1; i <= n; i++) {
		    sum += i;
		}

		System.out.println("The sum of all from 1 to 10 is " + sum);
		
		input.close();
	}
}
