package Array;

import java.util.Arrays;

public class reversearray {

	public static void main(String[] args) {
//	print reverse value	
		System.out.println("print reverse value-------------------------------------------------------------------------------------------------------------------");
		int[] value = { 85, 96, 32, 74, 87, 563 };

		System.out.println(value.length);

		for (int q = value.length - 1; q >= 0; q--) {

			System.out.print(value[q] + " ");

		}
		System.out.println();

//		print riverse value using String
		System.out.println(
				"print riverse value using String-------------------------------------------------------------------------------------------");

		String[] value2 = { "manual", "Testing", "Automation", "Testing", "API ", "Testing" };

		for (int w = value2.length - 1; w >= 0; w--) {

			System.out.println(value2[w]);
			System.out.println(Arrays.toString(value2));

		}

//		Dublicate value

		System.out.println(
				"Dublicate value-------------------------------------------------------------------------------------------------------------------");
		int[] value3 = { 850, 850, 850, 860, 860, 320, 320, 860, 870, 870, 563, 544, 789, 789, 562 };

		int number = 320;
		int count = 0;

		for (int k : value3) {

			if (k == number) {

				count++;

			}

		}
		System.out.println("Duplicates in array:" + count);

	System.out.println("dublicate value using string-----------------------------------------------------------------------------------------------------------------------------------");

	String[] arrys = { "manual", "manual", "manual", "Testing", "Testing", "Automation", "Testing", "Testing", "API ",
			"Testing" };
	String value5 = "manual";
	int count1 = 0;

	for(
	String k:arrys)
	{

		if (k == value5) {

			count1++;

		}

	}System.out.println("Duplicates in array:"+count1);

}}
