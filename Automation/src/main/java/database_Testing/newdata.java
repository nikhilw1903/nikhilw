package database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

import dynamiccode.base;

public class newdata extends base {

	public static void main(String[] args) throws SQLException {
		launchbrowse("chrome");
		hiturl("https://www.facebook.com/");
		String host = "localhost";
		String portnumber = "3306";

		Connection connect= DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/testing","root","DEVaa2304@");
	Statement newr = connect.createStatement()	;
	ResultSet result = newr.executeQuery("select email,password from testing1 where sr_no=2;");
	
	result.next();
	System.out.println(result.getString("email"));
	System.out.println(result.getString("password"));
	
	driver.findElement(By.cssSelector("input#email")).sendKeys(result.getString("email"));
	driver.findElement(By.cssSelector("input#pass")).sendKeys(result.getString("email"));
	
	
	}
}