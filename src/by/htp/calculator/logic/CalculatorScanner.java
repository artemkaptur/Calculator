package by.htp.calculator.logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorScanner {

	static Scanner scan = new Scanner(System.in);

	public static void setValues(Calculator calc) {
		System.out.println("Enter two values");
		try {
			calc.setNumber(scan.nextInt());
			calc.setNumber2(scan.nextInt());
			calc.calculateIntResult();
		} catch (InputMismatchException e) {
			// If there is a InputMismatchException try to read value as double
			try {
				calc.setDoubleNumber(scan.nextDouble());
				calc.setDoubleNumber2(scan.nextDouble());
				calc.calculateDoubleResult();
			} catch (InputMismatchException exc) {
				// If there is another InputMismatchException try to read value as String
				calc.setStr(scan.next());
				calc.setStr2(scan.next());
				calc.calculateStringResult();
			}
		}
	}

	public static String chooseOperation() {
		try {
			System.out.println("Choose arithmetic operation +, -, * or /");
			String operation = scan.next();
			return operation;
		} catch (IllegalArgumentException e) {
			System.out.println("You do something wrong, try again");
		}
		return "You do something wrong, try again";
	}
	
}
