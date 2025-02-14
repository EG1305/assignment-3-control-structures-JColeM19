//Code by Cole Miller

import java.util.Scanner;

public class RockPaperScissors {
 public static void main(String[] args) {
	 
	 Scanner input = new Scanner(System.in);
	 
	 int p1 = 0;
	 int p2 = 0;
	 
	 //Runs until you or the computer reaches 5 points
	 while (p1 < 5 && p2 < 5) 
	 {
	 //random number from 0-2
	 int random = (int)(Math.random() * 3);
	 
	 System.out.println("Enter a number 0(rock), 1(paper), or 2(scissors)");
	 int choice = input.nextInt();
	 System.out.println("You chose: " + choice);
	 System.out.println("Opponent chose: " + random);
	 
	 if(choice == 0 && random == 2)
	 {
		 System.out.println("You Won! Rock beats Scissors.");
		 p1++;
	 } else if(choice == 1 && random == 0)
	 {
		 System.out.println("You Won! Paper beats Rock.");
		 p1++;
	 } else if(choice == 2 && random == 1)
	 {
		 System.out.println("You Won! Scissors beats Paper.");
		 p1++;
	 } if(random == 0 && choice == 2)
	 {
		 System.out.println("You Lose! Rock beats Scissors.");
		 p2++;
	 } else if(random == 1 && choice == 0)
	 {
		 System.out.println("You Lose! Paper beats Rock.");
		 p2++;
	 } else if(random == 2 && choice == 1)
	 {
		 System.out.println("You Lose! Scissors beats Paper.");
		 p2++;
	 }
	  }
	 
	 //Displays the overall victor;
	 if(p1 == 5)
	 {
		 System.out.println("You are the Winner!");
	 } else if(p2 == 5)
	 {
		 System.out.println("You are the Loser! :(");
	 }
	 //Final Score
	 System.out.println("You had " + p1 + " points!");
	 System.out.println("Opponent had " + p2 + " points!");
		
	 input.close();
 }
}
