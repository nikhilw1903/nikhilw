package Constructor;

public class parameterrised_constructor {

	
	public parameterrised_constructor(){
	this(56);
		String p="salman";
		System.out.println(p);
	}
	public parameterrised_constructor(int a) {
		this(56,"salman");
		String k="sharukh khan";
		System.out.println(k);
		
		
	}
	public  parameterrised_constructor(int a,String b) {
		String d="kadar khan";
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 parameterrised_constructor jk=new  parameterrised_constructor();
	
	
	
	
	}

}
