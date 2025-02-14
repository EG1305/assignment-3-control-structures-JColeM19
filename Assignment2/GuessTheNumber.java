//Code by Cole Miller

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		//Designates the number to guess from 0-100
		int number = (int) (Math.random() * 101);
		System.out.println(number);
		
		//Begins the game
		System.out.println("Guess a number between 0 and 100");
		System.out.print("Enter your guess: ");
		int n = input.nextInt();
		
		//Gives hints to get you closer too the number
		if(n > number)
		{
			System.out.println("Your guess is too high!");
		} else if(n < number)
		{
			System.out.println("Your guess is too low!");
		}
		
		//Continues the game until you guess correctly
		while(number != n)
		{
			System.out.print("Enter your guess: ");
			n = input.nextInt();
			if(n > number)
			{
				System.out.println("Your guess is too high!");
			} else if(n < number)
			{
				System.out.println("Your guess is too low!");
			}
		}
		System.out.println("Congratulations! you guessed the number.");
		
		input.close();
	}

}
