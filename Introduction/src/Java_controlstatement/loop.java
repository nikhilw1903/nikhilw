package Java_controlstatement;

public class loop {

	public static void main(String[] args) {

//		ascending order
		for (int a = 1; a <= 50; a++) {

			System.out.println(a);

		}

//		decending Order
		for (int b = 50; b >= 1; b--) {

			System.out.print(b + " ");

		}

//		odd number
		for (int c = 1; c < 50; c = c + 2) {
			System.out.println(c);

		}

//	2 type of odd number

		for (int c = 1; c <= 50; c++) {

			if (c % 2 != 0) {

				System.out.println(c);
			}

//			Even number

			for (int k = 2; k <= 50; k = k += 2) {
				System.out.println(k);

			}

//		2 type of Even number

			for (int t = 1; t <= 50; t++) {

				if (t % 2 == 0) {

					System.out.print(c + " ");

				}
			}
//	Testing

			for (int q = 1; q <= 5; q++) {

				System.out.println("Testing");

			}
		}
	}
}
