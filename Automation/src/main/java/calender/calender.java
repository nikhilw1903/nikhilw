package calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamiccode.base;

public class calender extends base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	launchbrowse("chrome");
	hiturl("https://www.railyatri.in/train-ticket?utm_source=dwebhome_header_ttb&device_type_id=6");
	
 // Loop until required month-year appears
 while (true) {
     String displayedMonthYear = driver.findElement(By.xpath("//div[contains(@id,':r0:-grid-label')]")).getText();
     System.out.println("Currently showing: " + displayedMonthYear);

     String targetMonth = null;
	 if (displayedMonthYear.equalsIgnoreCase(targetMonth)) {
         break;  // found month
     } else {
         // Click next month
         driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
     }
 }

 // Select specific date (example: 15 September 2025)
 driver.findElement(By.xpath("//button[@aria-label='15 September 2025']")).click();

}}