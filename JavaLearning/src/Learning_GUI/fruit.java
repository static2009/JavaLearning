package Learning_GUI;
import javax.swing.JFrame;

public class fruit {
	public static void main(String[] args) {
		/*
		 //TNB #51 line 7-20
		String fnum = JOptionPane.showInputDialog("Enter First Number");
		String snum = JOptionPane.showInputDialog("Enter Second Number");
		
		int num1 = Integer.parseInt(fnum);
		int num2 = Integer.parseInt(snum);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The anser is: " + sum, "Simple Calc", JOptionPane.PLAIN_MESSAGE);
		
		//TNB 52 line 18-21
		grape grapeObject = new grape();
		grapeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grapeObject.setSize(350, 180);
		grapeObject.setVisible(true);
		*/
		//TNB 54 line 24-27
		orange orangeObject = new orange();
		orangeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		orangeObject.setSize(350, 100);
		orangeObject.setVisible(true);
	}
}
