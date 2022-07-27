import java.util.Scanner;
import java.text.DecimalFormat;


public class BMI {
	
	public static void main(String[] args) {
		
		System.out.println("This program calculates a person's body mass index (BMI)");
		
		double pounds;
		double feet;
		double inches;
		double BMI;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter weight in pounds:");
		pounds = scan.nextDouble();
	
		System.out.print("Enter height in feet and inches\nEnter feet:");
		feet = scan.nextDouble();
		
		System.out.print("Enter inches:");
		inches = scan.nextDouble();
		
		scan.close();
		
		BMI = (pounds * .454 / ( ((feet * 12 + inches)/39.37) * (feet * 12 + inches)/39.37));
		
		DecimalFormat df = new DecimalFormat(".###");
		
		System.out.println("Calculated BMI for " + feet +" feet " + inches + " inches and " + pounds + " is " + df.format(BMI) + "");
		
		
		
		
	}
	
	

}
