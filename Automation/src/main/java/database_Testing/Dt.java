package database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

import org.openqa.selenium.By;

import dynamiccode.base;

public class Dt extends base{

	public static void main(String[] args) throws SQLException, InterruptedException {
		String host ="localhost";
		String portnumber ="3306";
launchbrowse("chrome");
	hiturl("https://facebook.com");
	/*
//	jdbc connection
                 
	Statement cs=connect.createStatement();
	ResultSet r = cs.executeQuery("select email,password from testing1 where sr_no=2;");
	
	r.next();
	System.out.println(r.getString("email"));
	System.out.println(r.getString("password"));
	
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(r.getString("email"));
	driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(r.getString("password"));
	*/

//	Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/testing","root","DEVaa2304@");
//	Statement cs=connect.createStatement();
  Connection connect= DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/testing","root","DEVaa2304@");
	
	Statement cs = connect.createStatement();
	ResultSet result = cs.executeQuery("select email,password from testing1 where sr_no=2;");
	result.next();
	System.out.println(result.getString("email"));
	System.out.println(result.getString("password"));
	
	Thread.sleep(3000);

Connection connect1=DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/testing"+ "root");
	
Statement cs1=connect.createStatement();
	
	result=cs1.executeQuery("select email,password from testing1 where sr_no=2;");
	result.next();
	System.out.println(result.getString("email"));
	System.out.println(result.getString("password"));
	
	
	
	
	
	}
	
}