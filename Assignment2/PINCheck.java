//Code by Cole Miller

import java.util.Scanner;

public class PINCheck {
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		
		//Enter PIN Value
		System.out.println("Please Enter your PIN.");
		int n = input.nextInt();
		
		//ReEnter PIN and checks if it is correct
		System.out.println("Please confirm your PIN");
		int x = input.nextInt();
		if(n == x)
		{
			System.out.println("PIN accepted. You can access your account.");
			System.exit(0);
		} else System.out.println("Incorrect PIN. Try again.");
		
		
		while(n != x)
		{
			System.out.println("Please Enter your PIN.");
			x = input.nextInt();
			if(n != x)
			{
			System.out.println("Incorrect PIN. Try again.");
			} 
		}
			System.out.println("PIN accepted. You can access your account.");
			
			input.close();
	}
}
