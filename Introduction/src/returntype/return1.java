package returntype;

public class return1 {

//	without returntype without parameter
	int a = 56;

	public void ret1() {

				System.out.println(a);
		
		
		
	}
//	without reyurntype with paramete
	public void return2(int b) {
		a=b;
		System.out.println(b);
		
		
		
	}
//		with returnype and parametter
		
		public void return3() {
		System.out.println("automation testing");
		
		return;
	}


		public int addition (int a,int y) {
			
			
			System.out.println();
			
			return a+y;
		
		
		
		}
			
	public static void main(String[] args) {

		return1 r = new return1();
		r.ret1();
		r.return2(20);
		r.return3();
	
System.out.println(r.addition(75, 20));


			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	

