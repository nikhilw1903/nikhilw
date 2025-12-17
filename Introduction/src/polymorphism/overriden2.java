package polymorphism;

public class overriden2  extends overrideing{

	public void school() {
		
		System.out.println("entr without argument2");
		
	}
		public void name(String l) {
			
			System.out.println("enter with string argument 2");
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overriden2 hit=new overriden2 ();
		hit.school();
		hit.name("nikhil");

		
		overrideing hit2= new overrideing();
		hit2.school();
		hit2.name("nikhil");
		
		overrideing hit3 = new overriden2 ();
		hit3.name("salaman");
		
	}

}
