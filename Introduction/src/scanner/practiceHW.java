package scanner;

import java.util.Scanner;

public class practiceHW {

	public static void main(String[] args) {

		System.out.println("for loop----------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number which table u want  :");
		Scanner sc1 = new Scanner(System.in);

		int e = sc1.nextInt();

		for (int d = 1; d <= 10; d++) {
			System.out.println(e + "*" + d + "=" + (e * d));

		}

		System.out.println("while loop----------------------------------------------------------------------");

		Scanner sc2 = new Scanner(System.in);
		System.out.print("enter number which table u want  :");
		int c = sc2.nextInt();
	
		Scanner sc3 = new Scanner(System.in);
		int a = 1;
		while (a <= 10) {

			System.out.println(c + "*" + a + "=" + (c * a));
			a++;

		}

		System.out.println(
				" do while loop--------------------------------------------------------------------------------------");
		Scanner sc4 = new Scanner(System.in);
		System.out.print("enter number which table u want  :");
		int j = sc4.nextInt();
		
		Scanner sc5 = new Scanner(System.in);

		int h = 1;
		do {

			System.out.println(j + "*" + h + "=" + (h * j));
			h++;

		} while (h <= 10);

		System.out.println(
				"scnner +switch calculatiom----------------------------------------------------------------------------------------------------");

		Scanner ss = new Scanner(System.in);
		System.out.print("eneter 1 st value for claculate :");
		int u = ss.nextInt();

		Scanner ss1 = new Scanner(System.in);
		System.out.print("eneter operator for claculate :");
		String oper = ss1.nextLine();
		
		Scanner ss2 = new Scanner(System.in);
		System.out.print("enter 2 value for calculate :");
		int i = ss.nextInt();
		

		switch (oper) {

		case "+":

			System.out.println("the value is :"+(u + i));
			break;
		case "-":
			System.out.println("the value is :"+(u - i));
			break;
		case "*":
			System.out.println("the value is :"+(u * i));
			break;
		case "/":
			
			System.out.println("the value is :"+(u / i));
			break;
		default:

			System.out.println("Invalid");

		}

	}
}