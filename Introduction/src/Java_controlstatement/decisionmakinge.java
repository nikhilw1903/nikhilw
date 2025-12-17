package Java_controlstatement;

public class decisionmakinge {

	public static void main(String[] args) {


//25/9/2025
		// 1. Print month name on the basis of month number
		int month_numb = 1;
		switch (month_numb) {

		case 1:
			System.out.println("this is Jan");
			break;
		case 2:
			System.out.println("this is feb");
			break;
		case 3:
			System.out.println("this is mar");
			break;
		case 4:
			System.out.println("this is April");
			break;
		case 5:
			System.out.println("this is May");
			break;
		case 6:
			System.out.println("this is June");
			break;
		case 7:
			System.out.println("this is jully");
			break;
		case 8:
			System.out.println("this is Aug");
			break;
		case 9:
			System.out.println("this is sep");
			break;
		case 10:
			System.out.println("this is oct");
			break;
		case 11:
			System.out.println("this is nov");
			break;
		case 12:
			System.out.println("this is Dec");
			break;
			default:
				System.out.println("invalid month");
		}
	
				//2.Print month_number on the basis of month_name--HW
	
			String month_name = "tuesday";
				switch (month_name) {

				case "Jan":
					System.out.println("this is 1 month");
					break;
				case "feb":
					System.out.println("this is 2 month");
					break;
				case "Mar":
					System.out.println("this is 3 month");
					break;
				case "Apr":
					System.out.println("this is 4 month");
					break;
				case "May":
					System.out.println("this is 5 month");
					break;
				case "june":
					System.out.println("this is 6 month");
					break;
				case "jully":
					System.out.println("this is 7 month");
					break;
				case "aug":
					System.out.println("this is 8 month");
					break;
				case "sep":
					System.out.println("this is 9 month");
					break;
				case "oct":
					System.out.println("this is 10 month");
					break;
				case "nov":
					System.out.println("this is 11 month");
					break;
				case "Dec":
					System.out.println("this is 12 month");
					break;
					default:
						System.out.println("invalid month");
				
				}	
				
				//Print week_name on the basis of week_number
				int week_number = 3;  
		        switch (week_number) {
		            case 1: System.out.println("Sunday"); break;
		            case 2: System.out.println("Monday"); break;
		            case 3: System.out.println("Tuesday"); break;
		            case 4: System.out.println("Wednesday"); break;
		            case 5: System.out.println("Thursday"); break;
		            case 6: System.out.println("Friday"); break;
		            case 7: System.out.println("Saturday"); break;
		            default: System.out.println("Invalid week number");
		        }			
	
		    	//print employee_id on the basis of employee_name   
		        String employee_name = "Ravi";  // Change this to test
		        
		        switch (employee_name) {
		            case "Ravi": 
		                System.out.println("Employee ID: E101"); 
		                break;
		            case "Nikhil": 
		                System.out.println("Employee ID: E102"); 
		                break;
		            case "Sneha": 
		                System.out.println("Employee ID: E103"); 
		                break;
		            case "Amit": 
		                System.out.println("Employee ID: E104"); 
		                break;
		            default: 
		                System.out.println("Employee not found");
		        }
		        
	}}