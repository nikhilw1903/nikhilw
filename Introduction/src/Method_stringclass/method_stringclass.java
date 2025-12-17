package Method_stringclass;

public class method_stringclass {

	public static void main(String[] args) {
		


	
	String name ="Functional Testing";
	
	
//	length
	
	System.out.println("length is: "+name.length());
	System.out.println(name.length());
	
	
//	charAt
	System.out.println(name.charAt(5));
	System.out.println(name.charAt(10));
	System.out.println(name.charAt(6));
	
//	replace
	System.out.println("replace with new string:  "+name.replace("Testing", "Test"));
	System.out.println(name.replace("Testing", "Resting"));
	
//	indeoof 
	System.out.println("index output: "+name.indexOf("l"));
	System.out.println("index output: "+name.indexOf("u"));
	System.out.println("index output: "+name.indexOf(" "));
	
//	lowercase
	
	System.out.println("convert into lower case: "+name.toLowerCase());
	
	
//	upercase
	System.out.println("convert into upprcase: "+name.toUpperCase());
	
	
//	substring
	
	String f="automation manual testing";
	
	System.out.println(f.substring(4));
	
//	i want 2nd m postion
	
	String s=f.substring(5);
	System.out.println("i want to cheque 2nd m index"+" "+s.indexOf("m"));
	

//	substring beg index ending index
	
	System.out.println(f.substring(4, 10));
	
	
//  contain
  String a="automation faster than execution ";
  System.out.println(a.contains("faster"));
  
//  equals
 String w="automation";
  System.out.println(w.equals("mation"));
  System.out.println(w.equals("automation"));
  
//  equalsignorecase
  String x="automation";
  System.out.println(x.equalsIgnoreCase("Automation"));
  
//  endswith
  String h="Testing";
  System.out.println(h.endsWith("testing"));
  
 
//  trim

  
 //if we want to check  

String q="         automation faster             ";
System.out.println(q.length());  

//output :length=39

System.out.println("after trim length"+" "+q.trim().length());
	
	
	
	
	
	}

}
