import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter Your name ");
		JOptionPane.showMessageDialog(null, "Hello "+name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age: "));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");	

		double height= Double.parseDouble(JOptionPane.showInputDialog("Enter Your height: "));
		JOptionPane.showMessageDialog(null, "You are "+height+" ft");	
	}

}
