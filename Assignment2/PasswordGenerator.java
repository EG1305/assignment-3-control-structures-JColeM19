//Code by Cole Miller

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i = 0;

		//Enter amount of digits in your password.
		System.out.println("How many digits do you want to use for a numeric password?");
		int n = input.nextInt();
		
		//Displays the new password
		System.out.println("Your new password is: ");
		
		while(i < n)
		{
		//Random digit for each digit of password
		int x = (int) (Math.random() * 10);
		 System.out.print(x + " ");
		 i++;
		 
		 input.close();
		}
	}

}
