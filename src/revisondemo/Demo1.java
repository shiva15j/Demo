package revisondemo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Username =:");

		String username = sc.next();

		System.out.println("pin=:");

		int pin = sc.nextInt();

		if (username.equals("Shivam") && pin == 1234) {
			System.out.println("Welcome to Home page");
		} else if (username.equals("prajwal") && pin == 6789) {
			System.out.println("Welcome to Home page");
		}

		else {
			System.err.println("Invalid credentials");
		}

	}

}
