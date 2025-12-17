package Java_controlstatement;

import java.util.Scanner;

public  class Decision_makingstatement {

	public static void main(String[] args) {
	
		  int balance = 10000; int withdraw = 5000;
		 
		  if (withdraw <= balance) { if (withdraw % 100 == 0) {
		  System.out.println("Withdraw successful"); } else {
		  System.out.println("Amount must be multiple of 100"); } } else {
		  System.out.println("Insufficient Balance"); }
		  
	
		  	  System.out.println("yes it is!");
		 

		          // ---------- if else ----------
		          int h = 86;

		          if (h >= 90) {
		              System.out.println("Grade A");
		          } else if (h >= 80) {
		              System.out.println("Grade B");
		          } else if (h >= 60) {
		              System.out.println("Grade C");
		          } else if (h >= 50) {
		              System.out.println("Grade D");
		          } else {
		              System.out.println("Fail");
		          }

		          // ---------- switch example (number) ----------
		          int z = 5;
		          switch (z) {
		              case 1:
		                  System.out.println("the odd number is 1");
		                  break;
		              case 3:
		                  System.out.println("the odd number is 2");
		                  break;
		              case 5:
		                  System.out.println("the odd number is 3");
		                  break;
		              default:
		                  System.out.println("not matched");
		          }

		          // ---------- switch month ----------
		          int month_no = 5;
		          String month = null;
		          switch (month_no) {
		              case 1: month = "January"; break;
		              case 2: month = "February"; break;
		              case 3: month = "March"; break;
		              case 4: month = "April"; break;
		              case 5: month = "May"; break;
		              default: month = "Invalid month"; 
		          }
		          System.out.println("Your month is: " + month);

		          // ---------- switch week ----------
		          int day = 3;
		          switch (day) {
		              case 1: System.out.println("Monday"); break;
		              case 2: System.out.println("Tuesday"); break;
		              case 3: System.out.println("Wednesday"); break;
		              case 4: System.out.println("Thursday"); break;
		              case 5: System.out.println("Friday"); break;
		              case 6: System.out.println("Saturday"); break;
		              case 7: System.out.println("Sunday"); break;
		              default: System.out.println("Invalid day");
		          }

		          // ---------- calculator with switch ----------
		          int a = 56, c = 86;
		          String operation = "*";
		          switch (operation) {
		              case "+": System.out.println("Addition: " + (a + c)); break;
		              case "-": System.out.println("Subtraction: " + (a - c)); break;
		              case "*": System.out.println("Multiplication: " + (a * c)); break;
		              case "/": System.out.println("Division: " + (a / c)); break;
		              case "%": System.out.println("Modulo: " + (a % c)); break;
		              default: System.out.println("Invalid operation");
		          }

		          // ---------- Scanner input ----------
		          Scanner sc = new Scanner(System.in);
		          System.out.print("Enter your first name: ");
		          String first = sc.nextLine();
		          System.out.print("Enter your last name: ");
		          String last = sc.nextLine();

		          System.out.println("Hi Good Morning " + first + " " + last);

		          sc.close();
		      }
		  }

        	
      