package Learning_GUI;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class orange extends JFrame{
	private JTextField TFItem1;
	private JTextField TFItem2;
	private JTextField TFItem3;
	private JPasswordField passwordField;
	
	public orange(){
		super("Title Bar");
		setLayout(new FlowLayout());
		
		TFItem1 = new JTextField(10);
		add(TFItem1);
		TFItem2 = new JTextField("Enter Text Here");
		add(TFItem2);
		TFItem3 = new JTextField("Unchangeable", 20);
		TFItem3.setEditable(false);
		add(TFItem3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		thehandler handler = new thehandler();
		
		TFItem1.addActionListener(handler);
		TFItem2.addActionListener(handler);
		TFItem3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	private class thehandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String string = "";
			
			if(event.getSource() == TFItem1){
				string = String.format("field 1: %s", event.getActionCommand());
			}else if(event.getSource() == TFItem2){
				string = String.format("Field 2: %s", event.getActionCommand());
			}else if(event.getSource() == TFItem3){
				string = String.format("Field 3: %s", event.getActionCommand());
			}else if(event.getSource() == passwordField){
				string = String.format("Password Field is: %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
		}
	}
}
