package Alert;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dynamiccode.base;

public class practice extends base {

	public static void main(String[] args) throws IOException {

		launchbrowse("chrome");
		hiturl("https://demo.automationtesting.in/Alerts.html");
//simple alert
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[1]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		takescreenshot("screenshot", "screen");
		//confirmation alert
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]")).click();
		alert.accept();
		takescreenshot("screenshot", "screen2");
		

		//prompt alert
		
		alertsend("(//a[@class=\"analystic\"])[3]","//button[@class=\"btn btn-info\"]", "nikhil");

		
		
	}

}
