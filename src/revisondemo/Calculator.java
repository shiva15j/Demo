package revisondemo;

import java.util.Scanner;

public class Calculator {

	public static void sum() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		int sum = num + num1;
		System.out.println("The sum=:" + sum);

	}

	public static void sub() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		System.out.println("Num1=:");

		int num1 = sc.nextInt();

		int sub = num - num1;
		System.out.println("The sub=:" + sub);

	}

	public static void main(String[] args) {
		Calculator.sub();
		Calculator.sum();
	}

}
