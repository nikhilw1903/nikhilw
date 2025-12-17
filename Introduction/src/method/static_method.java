package method;

public class static_method {
	static String surname="wagh";  
	public void instance() {
		int a =56;
		
	System.out.println(surname);
	}
	public static void login() {
	String name="automation ";
	String other="Testing";
	System.out.println(name+other);
}
	
	public static void main(String[] args) {	
		static_method sm = new static_method();
		sm.instance();
		login();
		static_method.login();

	}

}
