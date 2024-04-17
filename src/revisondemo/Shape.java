package revisondemo;

import java.util.Scanner;

public class Shape {

	public static void rectnagle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Length=:");
		int length = sc.nextInt();

		System.out.println("Breadth=:");
		int breadth = sc.nextInt();

		int area = length * breadth;

		System.out.println("The area of the rectangle is=:" + area);

	}

	public static void sqaure() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Side=:");
		int side = sc.nextInt();
		int area = side * side;
		System.out.println("The area of the Sqaure is=:" + area);
	}

	public static void main(String[] args) {

		Shape.sqaure();

		Shape.rectnagle();
	}

}
