//Code by Cole Miller

import javax.swing.JOptionPane;


public class SpeedDetector2 {
 public static void main(String[] args) {
	 
	 String input;
	 
	 //Enter your speed
	 input = JOptionPane.showInputDialog("Please enter your speed.");
	 double speed = Double.parseDouble(input);
	 
	 //Displays Speed entered
	 JOptionPane.showMessageDialog(null, "Your Speed is " + speed);
	 
	 //Checks if your speed is above the "speed limit."
	 if(speed > 60)
	 {
	 JOptionPane.showMessageDialog(null,"Slow down, drive safe!", "Ticket Warning!", JOptionPane.WARNING_MESSAGE); 
	 //Changed from error to warning to match assignment picture
	 }
	 else {
		 JOptionPane.showMessageDialog(null, "Congratulations! You're a safe driver.");
	 }
 }
	
	
}
