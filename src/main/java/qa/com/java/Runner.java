package qa.com.java;

import java.util.Scanner;

public class Runner {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String result;
		boolean flag = true;
		do {

			System.out.println("Which operation would you like to perform:");
			menu();
			result = scanner.nextLine();
			result = result.equals("") ? "exit" : result;
			double a;
			double b;
			switch (result) {
			case "1":
				System.out.println("Enter the first number");
				a = Integer.parseInt(scanner.nextLine());
				System.out.println("Enter the second number");
				b = Integer.parseInt(scanner.nextLine());
				System.out.println(a + " + " + b + " = " + add(a, b));
				break;
			case "2":
				System.out.println("Enter the first number");
				a = Integer.parseInt(scanner.nextLine());
				System.out.println("Enter the second number");
				b = Integer.parseInt(scanner.nextLine());
				System.out.println(a + " - " + b + " = " + subtraction(a, b));
				break;
			case "3":
				System.out.println("Enter the first number");
				a = Integer.parseInt(scanner.nextLine());
				System.out.println("Enter the second number");
				b = Integer.parseInt(scanner.nextLine());
				System.out.println(a + " * " + b + " = " + multiplication(a, b));
				break;
			case "4":
				System.out.println("Enter the first number");
				a = Integer.parseInt(scanner.nextLine());
				System.out.println("Enter the second number");
				b = Integer.parseInt(scanner.nextLine());
				System.out.println(a + " / " + b + " = " + division(a, b));
				break;
			case "exit":
				flag = false;
				System.out.println("Exiting App");
				break;
			}

		} while (flag);
		scanner.close();
	}

	public static void menu() {
		System.out.println("Operations\n 1. add\n 2. subtract\n 3. multiplication\n 4. division\n");
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static double subtraction(double a, double b) {
		return a - b;
	}

	public static double multiplication(double a, double b) {
		return a * b;
	}

	public static double division(double a, double b) {
		return a / b;
	}

}