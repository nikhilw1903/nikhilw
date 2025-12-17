package Array;

public class without_allocatingmemory {

	public static void main(String[] args) {
System.out.println(	"without alocating memory using for each loop -------------------------------------------------------------------------------------------------------------------------------------------");


int[] r = { 56, 58, 32, 74, 79, 73, 32 };

for (int t : r) {

	System.out.println(t);

}

//for loop
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

System.out.println("------------------");

	}

}
