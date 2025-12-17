package method;

public class Instance_method {
//add static variable
	static String name="nikhil"; 
	int k = 96;
	static String d ="nikhil";
	int r;
	public void login1() {
		int a =56;
		String surname="salman";
		System.out.println(a);
		String course="manual";
		String name=" testing";
		
		System.out.println(course+name);
	System.out.println(surname);	
		
		System.out.println(d);
	}
	
	public void testing() {
		
		
		float a=56.23f;
		System.out.println();
				
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instance_method log = new Instance_method();
		System.out.println(name);
	log.login1();
	System.out.println(log.k);
	System.out.println(d);
	System.out.println(log.r);
	log.login1();
	log.testing();
	}
}
