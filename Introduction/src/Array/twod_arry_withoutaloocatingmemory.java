package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class twod_arry_withoutaloocatingmemory {

	public static void main(String[] args) {

System.out.println("multi dimentional arrya without allocating memory----------------------------------------------------------------------------------------------");
		
		int[][] w = { { 74, 56, 96 }, { 56, 23, 98 }, { 63, 65, 74 }, { 85, 54, 70 } };
		System.out.println("using nasted loop---------");
		for (int a = 0; a < w.length; a++) {
			for (int b = 0; b < 2; b++) {
				System.out.print(w[a][b]+" ");
			}
			System.out.println(" " );
		}
	
	
	System.out.println("");
	
	
	
	
	System.out.println("multi dimentional arrya without allocating memory using String--------------------");
	
	
	String [][] r = {{ "name","nikhil","wardha"},{"name","vaibhav","nagpur"},{"name","krishna","pune"},{"name","riya","sello"}} ;

	
	System.out.println("using nasted loop---------");
	for (int c = 0; c < 4; c++) {
		for (int d = 0; d < 3; d++) {
			System.out.print(r[c][d]+" ");
		}
		System.out.println(" " );
	}


System.out.println("");

	
	
	
	System.out.println("Object class hetrogenius data alocating memory----------------------------------------------------------------------------------------------------------------------");
	
	Object []rk={56,45.0f,"testing",'r'};
	
	
	System.out.println("using for each loop---------");
	for(Object k:rk) {
		
		System.out.println(k);
		
		
	}
	System.out.println("using for loop---------");
	for(int o=0;o<4;o++) {
		
		System.out.println(rk[o]);
		
	}
	
	
	System.out.println("Object class hetrogenius data without alocating memory----------------------------------------------------------------------------------------------------------------------");
	
Object [][]kl= {{56,85.0f,"testing"},{99,"manual","testing"},{52,74.0f,"nikhil"},{58,71.0f,"automation"}};
	

System.out.println("using nasted loop---------");
	for(int t=0;t<4;t++) {
		
		for(int y=0;y<3;y++) {
		
		System.out.print(kl[t][y]+" ");
		
	}System.out.println();
	}
	
	
	
	System.out.println("Arraysorting------------------------------------------------------------------------------------------------------------------------");
	
	int[]m={56,87,93,36,789};
	System.out.println("Before sorting-------------------------------------------");
	System.out.println(Arrays.toString(m));
	
	Arrays.sort(m);
	System.out.println("After sorting----------------------------------------------");
	System.out.println(Arrays.toString(m));

	
	}
}
