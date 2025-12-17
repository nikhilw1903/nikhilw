
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");

//		Single Operator

		driver.findElement(By.xpath("//div[@class=\"_2GaeWJ\"]"));

//		And Operator

		driver.findElement(By.xpath("//img[@class=\"_2puWtW _3a3qyb\" and @alt=\"Minutes\"]"));

//		or operator

		driver.findElement(By.xpath("//img[@class=\"_2puWtW _3a3qyb\" or @alt=\"Minutes\"]"));

//		multipeoperator

		driver.findElement(By.xpath("//img[@class=\"_2puWtW _3a3qyb\"][ @alt=\"Minutes\"]"));

//		parent and child

		driver.findElement(By.xpath("//div[@class=\"_2GaeWJ\"]//img[@alt=\"Minutes\"]"));

//		contains

		driver.findElement(By.xpath("//div[contains(@class,'_2GaeWJ')]"));

//	start-with
		driver.findElement(By.xpath("//div[starts-with(@class,\"_2GaeWJ\")]\r\n"));

		
//	
		
		
	}
}