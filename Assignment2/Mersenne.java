//Code by Cole Miller

import java.util.Scanner;

public class Mersenne {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        int x = 1;
        int c = 0;
        int i = 1;
        int m= (1 << i) - 1; // 2^i - 1

        System.out.println("Enter a number. The system will find all the Mersenne prime numbers smaller than this number.");
        int n = input.nextInt();

        while (m < n) {
        	if(x % 10 != 0)
        	{
            if (isPrime(m)) 
            	{
                System.out.print(m + "\t");
                c++;
                x++;
            	}else if (isPrime(m)) 
            	{
                    System.out.print(m + "\n");
                    c++;
                    x++;
            	}
            i++;
         // Update Mersenne number
            m = (1 << i) - 1;
        	}
        }

        System.out.println("\nThere are a total of " + c + " Mersenne prime numbers.");
       
        input.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
