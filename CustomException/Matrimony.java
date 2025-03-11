package CustomException;
import java.util.Scanner;

class notEligible extends Exception {
	private String msg ="I can Understand your Pain.......";
	@Override
	public String getMessage() {
		return msg;
	}
}
class AgeBarException extends Exception{
	private String msg1 ="Your Age is Bar please Dont do Marriage....";
	public String getMessage() {
		return msg1;
	}
}
	
public class Matrimony {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		try {
			eligibility(s.nextInt());
		} catch (notEligible e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (AgeBarException e) {
			e.printStackTrace();		
			}
	}
		
public static void eligibility(int age) throws notEligible,AgeBarException {
		if(age<30&&age>25) {
			System.out.println("Congrats Your Eligibile to The Marriage....");
		}
		else if (age<25) {
			throw new notEligible();
		}
		else {
			throw new AgeBarException();
		}
	}
}
