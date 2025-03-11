package RuntimeException;

public class StringIndexException {
	public static void main(String[] args) {
		String a="jeeva";
		int arr[]= {10,20,30};
		String sr[]= {"jeeva","manoj","karthik"};
		try {
			//char b=a.charAt(8);
			char name=sr[6].charAt(8);
			//System.out.println(arr[3]);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
