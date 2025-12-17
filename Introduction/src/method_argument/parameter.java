package method_argument;

public class parameter {

	int a ;
	float b;
	static int c;
	static String x;
	
	public void data(float y ) {
		y=a;
		System.out.println(y);
		
	}

public void data1(float y,int a,String f  ) {
		
		System.out.println(a);
		
	}

public void data2(String s,float y ) {
	
	System.out.println(c);
	
}
public void printsqure(int num) {
	
	System.out.println("print squre :" + (num*num));
}


public void addition(int f,float o ) {
	
	System.out.println(f+o);

}

public static void string_arg(String h) {
	
	System.out.println("hello "+h+"!");
	
	
	
}


	public static void main(String[] args) {
		
		parameter par = new parameter();
		par.data(80.66f);
		par.data2("nikhi", 56.33f);
		par.printsqure(6);
par.addition(78,87.66f);		
		string_arg("prajakta");
		
		
		
		
	}
}
