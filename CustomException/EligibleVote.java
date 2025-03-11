package CustomException;

import java.util.Scanner;

class AgeException extends Exception {
//	public AgeException(String v) {
//		super(v);
//	}
	String msg="Not Eligible For Vote Child..";
	public String getMessage() {
		return msg;
	}
}
public class EligibleVote {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws AgeException{
		System.out.println("Enter Your Age:");
		int age=s.nextInt();
		try {
			if(age>=18) {
				System.out.println("Eligible for Vote");
			}
			else
				throw new AgeException();
		} catch (AgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
