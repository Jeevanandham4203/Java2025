package CustomException;

public class FindIUsernamePassword {
	public static void main(String[] args) throws loginFail{
		String username="Jeeva";
		String Password="123456";
		try {
			if(username=="Jeeva"&&Password=="12345")
				System.out.println("loginSuccessfull");
			else
				throw new loginFail();
		} catch (loginFail e) {
			System.out.println(e.getmsg());
		}

	}
}
class loginFail extends Exception {
	String msg="invalid input";
	public String getmsg() {
		return msg;
	}
}
