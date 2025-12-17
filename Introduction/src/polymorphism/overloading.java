package polymorphism;

public class overloading {
	
	
	public void book() {
		System.out.println("normal");
		
	}
public void book(int a) {
	System.out.println("int available");
	
}
public void book(String a) {
	System.out.println("string available");
	
}
public void book(int a,int b,String l) {
	System.out.println("int and string available");
}

	public static void main(String[] args) {

		overloading jk = new overloading();
jk.book();
jk.book(45);
jk.book("nikhil");
jk.book(56, 89, "good");

	}

}
