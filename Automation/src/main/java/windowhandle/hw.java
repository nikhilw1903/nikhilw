package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import dynamiccode.base;

public class hw extends base {

	public static void main(String[] args) throws InterruptedException {

		launchbrowse("chrome");
		hiturl("https://www.railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=\"Date\"]")).click();

		int date = 2;

		Thread.sleep(3000);

		// First month-year read
		String monthyear = driver.findElement(By.xpath("//div[@class=\"MuiPickersCalendarHeader-label css-1v994a0\"]"))
		        .getText();
		System.out.println("Current month and year: " + monthyear);

		while (true) {

		    // check month-year
		    if (!(monthyear.equalsIgnoreCase("February 2026"))) {

		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//button[@type=\"button\"])[3]")).click(); // next arrow

		       
		    } else {
		        break;
		    }
		}

		// Select the date after loop
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='" + date + "']")).click();

		
	Set<String> window = driver.getWindowHandles();
		window.iterator();
		
		
	}

}
