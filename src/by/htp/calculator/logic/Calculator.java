package by.htp.calculator.logic;

public class Calculator {
	private int number;
	private int number2;
	private double doubleNumber;
	private double doubleNumber2;
	private String str;
	private String str2;
	private String operation;

	// We have default constructor here

	// Getters and setters methods
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public double getDoubleNumber() {
		return doubleNumber;
	}

	public void setDoubleNumber(double doubleNumber) {
		this.doubleNumber = doubleNumber;
	}

	public double getDoubleNumber2() {
		return doubleNumber2;
	}

	public void setDoubleNumber2(double doubleNumber2) {
		this.doubleNumber2 = doubleNumber2;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	// Here we choose arithmetic operation and enter the values which we'll
	// calculate
	public void calculateSmth() {
		operation = CalculatorScanner.chooseOperation();
		while (!operation.equals("+") && !operation.equals("-") && !operation.equals("/") && !operation.equals("*")) {
			operation = CalculatorScanner.chooseOperation();
		}
		CalculatorScanner.setValues(this);
	}

	public int calculateIntResult() {
		int result = 0;
		switch (operation) {
		case "+":
			result = number + number2;
			break;
		case "-":
			result = number - number2;
			break;
		case "*":
			result = number * number2;
			break;
		case "/":
			result = number / number2;
			break;
		}
		System.out.print(number);
		System.out.print(" " + operation + " ");
		System.out.println(number2 + " = " + result);
		return result;
	}

	public double calculateDoubleResult() {
		double result = 0;
		switch (operation) {
		case "+":
			result = doubleNumber + doubleNumber2;
			break;
		case "-":
			result = doubleNumber - doubleNumber2;
			break;
		case "*":
			result = doubleNumber * doubleNumber2;
			break;
		case "/":
			result = doubleNumber / doubleNumber2;
			break;
		}
		System.out.print(doubleNumber);
		System.out.print(" " + operation + " ");
		System.out.println(doubleNumber2 + " = " + result);
		return result;
	}

	public String calculateStringResult() {
		String result = new String();
		if (operation.equals("+")) {
			result = str.concat(str2);
			System.out.println(str + " " + operation.charAt(0) + " " + str2 + " = " + result);
		} else {
			System.out.println("Sorry, but we can do only concatenation with strings, choose another type of values");
			CalculatorScanner.setValues(this);
		}
		return result;
	}

}
