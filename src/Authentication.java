import java.util.Scanner;
//testing branch

import javax.swing.JOptionPane;

public class Authentication {


	private static String correctUsername = "Tanes";
	private static String correctPassword = "1234";
	private static String username;
	private static String password;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		getUnAndPw();
		authenticate();
		display();
		

	}
		
	public static void getUnAndPw(){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your username");
		username = keyboard.nextLine();
		
		System.out.println("Please enter your password");
		password = keyboard.nextLine();
		
	}
	
	public static boolean check() {
		if(username.equals(correctUsername) && password.equals(correctPassword)){
			System.out.println("Welcome, you have logged in");
			return true;
		}
		else {
			System.out.println("You have incorrectly entered either the username or the password.");
			return false;
		
		}
	}
	
	public static boolean check(String username1, String password1) {
		if(username1.equals(correctUsername) && password1.equals(correctPassword)){
			JOptionPane.showMessageDialog(null, "Welcome, you have logged in");
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, "You have incorrectly entered either the username or the password.",password1, JOptionPane.ERROR_MESSAGE, null);
			return false;
		
		}
	}

}
