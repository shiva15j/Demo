package conditonaldemo;

import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");
		int num = sc.nextInt();

		System.out.println("Num1=:");
		int num1 = sc.nextInt();

		int calc;

		System.out.println("Give the operation you want to do");
		String opr = sc.next();

		switch (opr) {
		case "+":

			calc = num + num1;
			System.out.println("The sum=:" + calc);

			break;

		case "-":

			calc = num - num1;
			System.out.println("The sub=:" + calc);

			break;

		case "*":

			calc = num * num1;
			System.out.println("The mul=:" + calc);

			break;

		case "/":

			calc = num / num1;
			System.out.println("The div=:" + calc);

			break;

		default:

			System.out.println("Incorrect operation");
			break;
		}

	}

}
