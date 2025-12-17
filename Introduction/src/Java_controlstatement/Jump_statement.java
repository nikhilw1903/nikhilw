package Java_controlstatement;

public class Jump_statement {

	public static void main(String[] args) {

		System.out.println(" // break statement in for loop -----------------------------------------------------------------------------------------");
		  // break statement in for loop 
		for(int a=1;a<=10;a++) {
		  
		  System.out.println(a+" "); if(a==5) {
		  
		  
		  break; }
		  
		  
		  
		  }
		 
		
		System.out.println(
				"break statement in for whileloop	--------------------------------------------------------------------------------------------------------------------------");
//	break statement in for whileloop	

		int b = 25;
		while (b >= 1) {

			System.out.println(b + " ");
		

			if (b == 10) {

				break;

			}
			b--;
		}
	System.out.println("break statement in for dowhileloop-------------------------------------------------------------------------------------------------------------------------");
		
//			break statement in for dowhileloop
	int c = 10;
	do {
	    System.out.println(c + " ");
	    
	    if (c == 5) {
	        break;
	    }
	    
	    c--;
	    
	} while (c >= 1);

	
		
	}

}
