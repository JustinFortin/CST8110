import java.util.Scanner;
import java.text.DecimalFormat;

public class Account {
	
	long accountNumber;
	String name;
	double balance;
	double interestPercent;
	double interestAmount;
	
	
	public Account() {
		
		this.accountNumber = 1000;
		this.name = "Not Set";
		this.balance = 100;
		this.interestPercent = 0.01;
	}
	
	public Account(long accountNumber, String name, double balance, double interestPercent) {
		
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.interestPercent = interestPercent;
		
	}
	
	public void readInfo() {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		accountNumber = scan.nextLong();
		
		System.out.print("Enter name: ");
		name = scan.next();
		
		System.out.print("Enter balance: ");
		balance = scan.nextDouble();
		
		System.out.print("Enter interest percent: ");
		interestPercent = scan.nextDouble();
		
		if(interestPercent <0) {
			
			System.out.println("Interest percent must be a positive number.");
			System.out.print("Enter interest percent: ");
			interestPercent = scan.nextDouble();
			
			while(interestPercent <0);
				
		}
	}

	public void calculateInterest() {
		
		interestAmount = balance*interestPercent/100;
		
			}
	
	public void displayInfo() {
		
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.print(accountNumber +"\t" + name +"\t" + balance +"\t" + df.format(interestPercent) +"\t"+ df.format(interestAmount) +"\t\n");
	}
	
}
