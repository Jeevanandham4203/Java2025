package CustomException;

import java.util.Scanner;

class LoginFailed extends Exception{
	String error="Plz Entered Correct UserName or Password";
	 public String GetError() {
		 return error;
	 }
}
public class LoginCredential {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args)throws LoginFailed {
		System.out.println("Please Enter UserName:");
		String UserName=s.nextLine();
		System.out.println("Enter The Password:");
		String Password=s.nextLine();
		try {
			if(UserName.equals("Jeeva")&&Password.equals("Jeeva@007")) {
				System.out.println("Login Succefully...!");
			}
			else
				throw new LoginFailed();
		} catch (LoginFailed e) {
			System.out.println(e.GetError());
			e.printStackTrace();
		}
		

	}

}
