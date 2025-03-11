package RuntimeException;

public class NullPointer {
	public static void main(String[] args) {
		String a=null;
		try {
			String b=a.toUpperCase();
			
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
