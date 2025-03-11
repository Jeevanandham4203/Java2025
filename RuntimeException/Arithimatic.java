package RuntimeException;

public class Arithimatic {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a/b);
		int c=0;
		try {
			//int d=b/c;//arithimetic Exception
			System.out.println(b/c);

		} catch (ArithmeticException
				e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
