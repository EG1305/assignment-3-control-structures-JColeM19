//Code by Cole Miller

import java.util.Scanner;

public class CoinToss {
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int i = 0;
		int h = 0;
		int t = 0;
		//Enter how many coin tosses you want
		System.out.println("How many coin tosses do you want?");
		int x = input.nextInt();
		System.out.println("Now I will toss the coin " + x + " times.");
		
		//Flips the coin x amount of times
		while(i < x)
		{
			int f = (int) (Math.random() * 2);
			if(f == 0)
			{
				System.out.println("Toss: \t Heads.");
				h++;				
			} else if(f == 1)
			{
				System.out.println("Toss: \t Tails.");
				t++;
			}
			i++;
		}
		
		//Displays how many times the coin landed heads up or tails up
		System.out.println("Heads facing up: " + h);
		System.out.println("Tails facing up: " + t);
		
		input.close();
	}

}
