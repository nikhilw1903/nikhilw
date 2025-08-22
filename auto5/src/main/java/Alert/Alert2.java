package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamiccode.base;

public class Alert2 extends base{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

launchbrowser("chrome");
hiturl("https://demo.automationtesting.in/Alerts.html");

driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();

	Alert alert1=driver.switchTo().alert();
//	alert1.accept();
	alert1.dismiss();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	Alert alert3=driver.switchTo().alert();
	alert3.dismiss();
	
	driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
	driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	Alert alert4=driver.switchTo().alert();
	alert4.toString();
	alert4.accept();

	
	}

}
