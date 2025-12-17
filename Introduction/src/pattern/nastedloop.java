package pattern;

public class nastedloop {

	public static void main(String[] args) {

//		nasted loop paractice

		for (int c = 1; c <= 2; c++) {
			System.out.println("option" + c);

			for (int d = 1; d <= 3; d++) {
				System.out.println(" suboption" + d);
			}
		}

		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------");

		// solid rectangle

		for (int a = 1; a <= 5; a++) {

			for (int b = 1; b <= 5; b++) {
				System.out.print(b);

			}

			System.out.println("");

		}

	}

}
