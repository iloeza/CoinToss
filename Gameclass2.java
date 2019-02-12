package JavaSteps;

import javax.swing.JOptionPane;

public class Gameclass2 extends gameclass {

	public static void main(String[] args) {
		gameclass obj = new gameclass();
		
		int tiro =Integer.parseInt(JOptionPane.showInputDialog("How many times you want the coin to be flipped?"));	
		obj.caraosol(tiro);
	}
}
