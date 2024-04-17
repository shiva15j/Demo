package exceptiondemo;

import java.util.Scanner;

public class Election {

	public static void vote() throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Age=:");

		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			throw new Exception("Under Age");
		}

	}

}
