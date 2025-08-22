package database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

import dynamiccode.base;

public class Dt extends base{

	public static void main(String[] args) throws SQLException {
		String host ="localhost";
		String portnumber ="3306";
launchbrowser("chrome");
	hiturl("https://facebook.com");
	
//	jdbc connection
	Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/testing", "root", "DEVaa2304@");
	Statement cs=connect.createStatement();
	ResultSet r = cs.executeQuery("select email,password from testing1 where sr_no=2;");
	
	r.next();
	System.out.println(r.getString("email"));
	System.out.println(r.getString("password"));
	
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(r.getString("email"));
	driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(r.getString("password"));
	}

}
