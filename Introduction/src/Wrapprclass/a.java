package Wrapprclass;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;

public class a {

	public static void main(String[] args) {
		ArrayList<Integer> rool = new ArrayList<Integer>();
		rool.add(1);
		rool.add(2);
		rool.add(3);
		rool.add(4);
		rool.add(5);
		rool.add(1, 3);
		System.out.println(rool.get(2));
		System.out.println(rool.set(1, 45));
		System.out.println(rool);
		rool.remove(2);
		System.out.println(rool);
		rool.remove(3);
		System.out.println(rool.size());
		System.out.println(rool.contains(5));
		System.out.println(rool.isEmpty());
		rool.clear();
		System.out.println(rool);

		LinkedList<String> fix = new LinkedList<String>();

		fix.add("new");
		fix.add("new2");
		fix.add("new3");
		fix.add("new4");
		fix.remove("new4");
		System.out.println(fix);
		System.out.println(fix.contains("new3"));
		System.out.println(fix.size());
		fix.clear();
		System.out.println(fix);
	
	
	HashSet <Integer> har = new HashSet<Integer>();	
	
for(int a=1;a<10;a++) {
	
	
	har.add(a);
	
	
	
}
	System.out.println(har);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
