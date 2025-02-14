//Code by Cole Miller

import java.math.BigInteger;

public class RiceChessboard {
    public static void main(String[] args) {
    	
        BigInteger riceOnSquare = BigInteger.ONE;  
        BigInteger totalRice = BigInteger.ONE;     

        for (int i = 2; i <= 64; i++) 
        {
        	  // Increase grains exponentially
            //riceOnSquare *= 2;
        	riceOnSquare = riceOnSquare.multiply(BigInteger.TWO);
            //totalRice += riceOnSquare; 
        	totalRice = totalRice.add(riceOnSquare);
        }

        //Had to look up how to be able to include the whole number due to how large it was
        System.out.println("Rice on 64th square: " + riceOnSquare);
        System.out.println("Total rice on board: " + totalRice);
    }
}