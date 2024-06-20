import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		boolean answer = true;
		
		System.out.println("Welcome to my calculator!");
		
		do {
			Scanner scan = new Scanner(System.in);
			scan.useLocale(Locale.US);
			
			double num1,num2;
			int choice;
			
			try {
				System.out.print("Enter the first number: ");
					num1 = scan.nextDouble();
				System.out.print("Enter the second number: ");
					num2 = scan.nextDouble();
			} catch(InputMismatchException e) {
				System.out.println("Invalid input, examples of valid inputs: \n1.0 \n2.54 \n3 \n");
				continue;
			}
			
			System.out.println("Choose the operation:");
			System.out.println("[1] - Addition");
			System.out.println("[2] - Subtraction");
			System.out.println("[3] - Multiplication");
			System.out.println("[4] - Division");
			
			try {
			choice = scan.nextInt();
			} catch(InputMismatchException e) {
			choice = -1;
			}
			
			switch(choice) {
				case 1:{
					System.out.println(num1 + " + "+ num2 + " = " + sum(num1,num2));
				}break;
				
				case 2:{
					System.out.println(num1 + " - "+ num2 + " = " + subtract(num1,num2));
				}break;
				
				case 3:{
					System.out.println(num1 + " * "+ num2 + " = " + multiply(num1,num2));
				}break;
					
				case 4:{
					System.out.println(num1 + " / "+ num2 + " = " + divide(num1,num2));
				}break;
				
				default:{System.out.println("Choose a valid option");}
			}
			
			System.out.println("Do you want to continue?");
			System.out.println("[0] - No");
			System.out.println("[1] - Yes");
			answer = (scan.nextInt() == 1);
		}while(answer);
	}

	public static double sum(double x, double y) {return x+y;}

	public static double subtract(double x, double y) {return x-y;}

	public static double multiply(double x, double y) {return x*y;}

	public static double divide(double x, double y) {return x/y;}

	
}

