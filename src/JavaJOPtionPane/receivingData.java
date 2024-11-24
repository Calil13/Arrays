package JavaJOPtionPane;

import java.util.Random;

import javax.swing.JOptionPane;

public class receivingData {

	public static void main(String[] args) {
		
		int i = 1;
		Random r = new Random();
		int num = r.nextInt(5);
		
		while(true) {
			
			String guess = JOptionPane.showInputDialog("Input a guess: ");
			int t = Integer.parseInt(guess);
			
			if(t == num) {
				String message = "Guess is correct! You guessed it at the " +i+ ". guess";
				JOptionPane.showMessageDialog(null, message);
				break;	
			}else {
				i++;
			}
		}

	}

}
