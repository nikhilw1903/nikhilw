package Array;

public class practice {

	public static void main(String[] args) {

		/*
		//using integer
		int[] first = new int[5];
		first[0] = 10;
		first[1] = 20;
		first[2] = 30;
		first[3] = 40;
		first[4] = 50;
//total Length
		System.out.println("total Length: " + first.length);
//	check second index which value lie	
		System.out.println("check second index which value lie:" + first[2]);
		System.out.println("for each loop in array------------------------------------------------------------------------------------------------------------------------");
//for Each Loop
		for (int b : first) {

			System.out.println("useing for each loop: " + b);
		}

		System.out.println("for loop in array------------------------------------------------------------------------------------------------------------------------");	
		for(int f=0;f<first.length;f++) {
			
			System.out.println("using in array int dispay value using for loop"+first[f]);
			
			
		}
		
		
	System.out.println("String Using Array----------------------------------------------------------------------------------------------------------------------------------------");	
		
		
//			using String 
			String[] second = new String[5];
			second[0] = "functionl testing";
			second[1] = "smoke Testing";
			second[2] = "sanity Testing";
			second[3] = "regression Testing";
			second[4] = "retesting";
			// total Length
			System.out.println("find out length: "+second.length);

//	check second index which value lie			

			System.out.println("check third index which value lie: "+ second[3]);
			
			
//				for each
			System.out.println("for each loop in array------------------------------------------------------------------------------------------------------------------------");
			for (String h : second) {

				System.out.println("using in array String dispay valueusing for each loop: "+h);
			}
			
		System.out.println("for loop in array------------------------------------------------------------------------------------------------------------------------");	
			for(int r=0;r<second.length;r++) {
				
				System.out.println("using in array String dispay valueusing for loop:"+second[r]);
				
			}
				
			*/	
		System.out.println(
				"without alocating memory using for each loop -------------------------------------------------------------------------------------------------------------------------------------------");
//			without alocating memori

		int[] r = { 56, 58, 32, 74, 79, 73, 32 };

		for (int t : r) {

			System.out.println(t);

		}

//		for loop
		System.out.println(
				"using for loop----------------------------------------------------------------------------------------------------------------------------");
		for (int p = 0; p < 6; p++) {

			System.out.println(r[p]);

		}

		System.out.println(
				"without alocating memory using string for each loop-------------------------------------------------------------------------------------------------------------------------------------------");
		String[] files = { "manual", "automation", "Testing", "Testng2", "Testing3" };

		for (String o : files) {

			System.out.println(o);

		}

		System.out.println(
				"without alocating memory using string for loop-------------------------------------------------------------------------------------------------------------------------------------------");

		for (int q = 0; q < 5; q++) {

			System.out.println(files[q]);

		}

		System.out.println(
				"------------Multi dimension Arrya-------------------------------------------------------------------------------------------------------------------");

		int[][] rt = new int[3][5];

		rt[0][0] = 56;
		rt[0][1] = 86;
		rt[0][2] = 76;
		rt[0][3] = 36;
		rt[0][4] = 46;

		rt[1][0] = 74;
		rt[1][1] = 85;
		rt[1][2] = 32;
		rt[1][3] = 30;
		rt[1][4] = 47;

		rt[2][0] = 16;
		rt[2][1] = 26;
		rt[2][2] = 36;
		rt[2][3] = 46;
		rt[2][4] = 56;

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 5; b++) {

				System.out.print(rt[a][b] + " ");

			}

			System.out.println();

		}
		System.out.println(
				"Using String multi dimension Array-----------------------------------------------------------------------------------------------------------------------------------------------");
//	String

		String[][] st = new String[3][5];

		st[0][0] = "Testing";
		st[0][1] = "manual";
		st[0][2] = "API";
		st[0][3] = "Root";
		st[0][4] = "Analysis";

		st[1][0] = "memo";
		st[1][1] = "Squre";
		st[1][2] = "root";
		st[1][3] = "good";
		st[1][4] = "bad";

		st[2][0] = "anti";
		st[2][1] = "automation";
		st[2][2] = "Mobile";
		st[2][3] = "tablet";
		st[2][4] = "testing 2";

		for (int c = 0; c < 3; c++) {
			for (int d = 0; d < 5; d++) {

				System.out.print(st[c][d] + " ");

			}

			System.out.println();

		}

	}
}
