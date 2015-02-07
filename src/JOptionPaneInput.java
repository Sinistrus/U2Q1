import javax.swing.JOptionPane;


public class JOptionPaneInput {
	
	private static String username1;
	private static String password1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		username1 = JOptionPane.showInputDialog("Enter Username");
		password1 = JOptionPane.showInputDialog("Enter Password");
		
		
		Authentication.check(username1, password1);
		

	}

}
