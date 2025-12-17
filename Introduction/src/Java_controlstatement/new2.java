package Java_controlstatement;

public class new2 {

	public static void main(String[] args) {
		System.out.println(
				" // break statement in for loop -----------------------------------------------------------------------------------------");
		// break statement in for loop
		for (int e = 1; e <= 10; e++) {

			if (e == 5) {
				continue;

			}
			System.out.println(e + " ");
		}

		System.out.println(
				"continue statement in for whileloop	--------------------------------------------------------------------------------------------------------------------------");
		// while loop with continue

		int f = 25;
		while (f >= 1) {
			f--;
			if (f == 10) {
				continue;
			}

		System.out.println(f+" ");
		}
	

		System.out.println(
				"While loop with continue complete---------------------------------------------------------------------------------------------------");

		// do-while loop with continue

		int g = 10;
		do {
			g--;
			if (g == 5) {
				continue;
			}
			System.out.println(g + " ");
		} while (g >= 1);
		
	
	}


}