package demo;

import java.util.Scanner;

import conditonaldemo.ScanDemo;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Day:=");

		int day = sc.nextInt();

		switch (day) {
		case 1:

			System.out.println("Monday");
			break;

		case 2:

			System.out.println("Tuesday");
			break;

		case 3:

			System.out.println("Wednsday");
			break;

		case 4:

			System.out.println("Thrusday");
			break;

		case 5:

			System.out.println("Friday");
			break;

		case 6:

			System.out.println("Saturday");
			break;

		case 7:

			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid Day");
			break;
		}

	}

}
