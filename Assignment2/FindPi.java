//Code by Cole Miller

import java.util.Scanner;
import java.text.DecimalFormat;

public class FindPi {
    public static void main(String[] args) {
    	
    	DecimalFormat df = new DecimalFormat("0.00");
    	
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program will iteratively find the digits of PI using the Leibniz formula");
        System.out.println("How many iterations should we use? Please enter an integer: ");
        
        int t = input.nextInt();

        // Start time measurement
        long start = System.nanoTime();

        double pi = 0.0;
        for (int i = 0; i < t; i++) {
            if (i % 2 == 0) {
                pi += 1.0 / (2 * i + 1);
            } else {
                pi -= 1.0 / (2 * i + 1);
            }
        }
        
        //Leibniz formula for PI (Had to look up for assistance)
        pi *= 4; 

     // End time measurement
        long end = System.nanoTime(); 
        
     // Convert nanoseconds to seconds
        double Time = (end - start) / 1_000_000_000.0; 

        System.out.println("PI = " + pi);
        System.out.println("After " + t + " iterations.");
        System.out.println("This operation took " + df.format(Time) + " seconds");
        
        input.close();
    }
}
