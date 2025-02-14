//Code by Cole Miller

import java.util.Scanner; 

public class Summation {
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int x = 1;
		int y = 0;
		
		System.out.println("This program will add all numbers you enter.");
		System.out.println("Enter 0 for me to stop adding.");
		
		while(x != 0)
		{
		int n = input.nextInt();
		System.out.println("You Entered: " + n);
		//Checks if 0 was entered
		if(n==0)
		{
			x = 0;
		}
		//adds all entered numbers together
		y += n;
		System.out.println("The sum is " + y);
		}
		
		//returns the sum
		System.out.println("The sum of all the numbers you entered is " + y);
		
		input.close();
	}
}
