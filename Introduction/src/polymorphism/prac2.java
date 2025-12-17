package polymorphism;

public class prac2 extends prac {

	public void testing() {
System.out.println("prac method parent classgh  ");
	}

	public void testing(int l) {
		System.out.println("prac method parent class2 ");
	}

	public void testing(String l) {
		System.out.println("prac method parent class3 ");
	}

	public static void main(String[] args) {

		prac2 lp = new prac2();
		lp.testing();
		prac lk = new prac2();
		lk.testing();
	
	prac uy = new prac ();
	uy.name();
	uy.name(32);
	uy.name("Testing");
	
	}

}
