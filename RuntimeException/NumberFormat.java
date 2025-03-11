package RuntimeException;

public class NumberFormat {
	public static void main(String[] args) {
		String a="jeeva11";
		try {
			//System.out.println(a.toUpperCase());
			int b=Integer.parseInt(a);
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
