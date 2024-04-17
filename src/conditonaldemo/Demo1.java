package conditonaldemo;

public class Demo1 {

	public static void main(String[] args) {

		int result = 34;

		if (result > 33 && result <= 40) {

			System.out.println("D grade");

		}

		else if (result > 40 && result <= 50) {
			System.out.println(" C grade");
		}

		else if (result > 50 && result <= 70) {
			System.out.println(" B grade");
		}

		else if (result > 70 && result <= 80) {
			System.out.println(" A grade");
		}

		else if (result > 80 && result < 100) {
			System.out.println(" A+ grade");
		}

		else {
			System.out.println("Fail");
		}

	}

}
