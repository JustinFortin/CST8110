
public class AccountTest {
	
	public static void main(String[] args) {
		
		Account test = new Account();
		Account acc1 = new Account();
		Account acc2 = new Account(1001, "John", 5000, 3.5);
		Account acc3 = new Account();

		acc3.readInfo();
		acc1.calculateInterest();
		acc2.calculateInterest();
		acc3.calculateInterest();
		acc1.displayInfo();
		acc2.displayInfo();
		acc3.displayInfo();

	}

}
