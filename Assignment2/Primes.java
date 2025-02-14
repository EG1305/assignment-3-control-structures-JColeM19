//Code by Cole Miller

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        int x = 1;
        int c = 0;

        System.out.println("Enter a number. The system will find all the prime numbers smaller than this number.");
        int n = input.nextInt();



        for (int i = 2; i < n; i++) {
        	
        	//Prints 10 of the prime numbers to a line spaced out
        	if(x % 10 != 0)
        	{
            if (isPrime(i)) 
            	{
                System.out.print(i + "\t");
                c++;
                x++;
            	}
            }else if (isPrime(i)) 
        	{
            System.out.print(i + "\n");
            c++;
            x++;
        	}
        }

        System.out.println("\nThere are a total of " + c + " prime numbers.");
        
        input.close();
    }

    
    //Class to check if a number is prime and returns a value corresponding
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
