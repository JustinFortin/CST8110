import java.util.Scanner; //program uses class Scanner

/**
 * This program prompts the user to enter a number and then display the entered number
 * 
 * @author Anu Thomas
 * @version 1.0
 * @since 2019-09-03 CST8110 Introduction to Programming
 */
public class JavaMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 ;
		int number2 ;
		int number3 ;
		
		System.out.println("This program reads two numbers, finds the sum and displays it. \n" );
	
		
		System.out.print("Enter first number: "  ) ;
		number1 = input.nextInt();

		System.out.print("Enter second number: " ) ;
		number2 = input.nextInt();
		
		number3 = number1 + number2;

		System.out.println("\nThe sum of " + number1 + " and " + number2 + " is " + number3 );

		input.close();
	} // end of main

} // end of class
