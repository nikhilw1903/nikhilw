package polymorphism;

public class prac {

	public void name() {
		
		System.out.println("parent method name");
		
	}
	
	public void testing() {
		
		
		
		System.out.println("parent class testing");
	}
	public void name(int a) {
		
		System.out.println("parent method name2");
		
		
		
	}
	public void name(String j) {
	System.out.println("parent method name2");
		
		
	}
	
	
	
	
	public static void main(String[] args) {

		
		prac pf = new prac();
		pf.name();
		pf.name(56);
		pf.name("testing");

	}

}
