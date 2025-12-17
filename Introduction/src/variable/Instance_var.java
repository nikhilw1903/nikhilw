package variable;

public class Instance_var {
//instance variable
	String a = "automation testing";
	byte a1 = 63;
	short b = 56;
	int jk = 896;
	long lp = 456;
	float rite = 78.63f;
	double dor = 7456.23;

	char h = 'G';

	public void instance() {
		System.out.println(a);
		System.out.println(a1);
		System.out.println(b);
	}

	public void instance2() {
		System.out.println(jk);
		System.out.println(lp);
		System.out.println(rite);
		System.out.println(dor);
	}

	public static void static1() {

		Instance_var inst = new Instance_var();
		System.out.println(inst.a);
		System.out.println(inst.a1);
		System.out.println(inst.b);
	}

	public static void static2() {
		Instance_var inst = new Instance_var();
		System.out.println(inst.jk);
		System.out.println(inst.lp);
		System.out.println(inst.rite);
		System.out.println(inst.dor);

	}

	public static void main(String[] args) {

		Instance_var inst = new Instance_var();
		inst.instance();
		inst.instance2();
		static1();
//	2nd type call static method
		Instance_var.static1();
	
//	directly access instance variable in main method
		System.out.println(inst.a);
		System.out.println(inst.a1);
		System.out.println(inst.b);
		System.out.println(inst.jk);
		System.out.println(inst.lp);
		System.out.println(inst.rite);
		System.out.println(inst.dor);

	
	}

}
