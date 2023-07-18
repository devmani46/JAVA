package clasroomProjects;

import javax.swing.JOptionPane;

public class Input01 {

	public static void main(String[] args) {
		String inputString = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, inputString);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age: "));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");	
	}

}
