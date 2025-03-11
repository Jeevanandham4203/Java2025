package CustomException;

public class UseAc {
//	public UseAc(String msg) {
//		super(msg);
//	}

	public static void main(String[] args) throws NoWarrantyException {
		Ac ac1 = new Ac("cromo", "5star", 30000, 0);
		Ac ac2 = new Ac("cromo", "5star", 30000, 5);
		Ac ac3 = new Ac("cromo", "5star", 30000, 3);
		Ac ac4 = new Ac("cromo", "5star", 30000, 0);
		Ac ac5 = new Ac("cromo", "5star", 30000, 2);
		try {
			ac1.NoWarranty();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
		} finally {
			ac2.NoWarranty();
			ac3.NoWarranty();
			ac4.NoWarranty();
		}
		
	}
}

class Ac {
	String brand;
	String model;
	int price;
	int noOfMonthsWarranty;

	public void NoWarranty() throws NoWarrantyException {
		if (noOfMonthsWarranty <= 0) {
			throw new NoWarrantyException("NoWarranty");
		} else
			System.out.println("Warranty Available is: " + noOfMonthsWarranty + " Year");
	}

	public Ac(String brand, String model, int price, int noOfMonthsWarranty) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.noOfMonthsWarranty = noOfMonthsWarranty;
	}

	public Ac(int noOfMonthsWarranty) {
		this.noOfMonthsWarranty = noOfMonthsWarranty;
	}
}

class NoWarrantyException extends Exception {
	public NoWarrantyException(String msg) {
		super(msg);
	}
}