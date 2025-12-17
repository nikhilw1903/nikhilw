package Constructor;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

//	Default Constructor
	public practice() {

		System.out.println("Default constructor");

	}

	public void name() {

		System.out.println("Instance Method");
	}

	public static void name2() {

		System.out.println("Static Method");
	}

//	User define Constructor

	public practice(String name) {

	}

	public void name5() {

		System.out.println("Instance Method");
	}

	public static void name4() {

		System.out.println("Static Method");
	}

//	Parameterized Constructor

	public practice(String name2, int j, char r) {

		System.out.println("this is parameterised cobstructor");

	}

	public static void main(String[] args) {
		int[] jk = new int[4];
		Scanner sc = new Scanner(System.in);

		// taking input
		for (int s = 0; s < 4; s++) {
			System.out.print("Enter value for index :");
			jk[s] = sc.nextInt();
		}
		System.out.println(Arrays.toString(jk));

		practice pr = new practice();
		pr.name();
		pr.name2();

		practice pr2 = new practice("Testing");

		pr.name5();
		pr.name4();

		practice pr3 = new practice("manual", 56, 'H');

	}

}
