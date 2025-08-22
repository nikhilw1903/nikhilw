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
		launchbrowser("chrome");
		hiturl("https://www.facebook.com/");
String host="localhost";
String portnumber="3306";
Connection connct = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/testing","root","DEVaa2304@");
	Statement cs = connct.createStatement();
	ResultSet execute = cs.executeQuery("select email,password from testing1 where sr_no=2;");
	execute.next();

	System.out.println(execute.getString("email"));
	System.out.println(execute.getString("password"));
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("getString(\"email\")");
	driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("getString(\"password\")");

	}
	
	
	}

