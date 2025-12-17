package Encapsulation;

public class enc {
/*
	private String password = "Stp123";

	private void login(String a) {

		password = a;
		System.out.println(a);
	}
*/
	
	
	private int actual_amt=7000;
	
	private void hide_amt( int required_amt) {
		
		
 actual_amt = required_amt;

		System.out.println(actual_amt);
		
		
	} 

	
	public static void main(String[] args) {

		enc en = new enc();
		
		en.hide_amt(2000);
		
		
		
		
		
	}

}
