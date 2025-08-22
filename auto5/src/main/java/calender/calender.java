package calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamiccode.base;

public class calender extends base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	launchbrowser("chrome");
	hiturl("https://www.railyatri.in/train-ticket?utm_source=dwebhome_header_ttb&device_type_id=6");
		
	 // From station
    WebElement From = driver.findElement(By.xpath("//input[contains(@id,'fromstation')]"));
    From.sendKeys("Pune");
    Thread.sleep(1000);
    From.click();

    // To station
    WebElement To = driver.findElement(By.xpath("//input[contains(@id,'tostation')]"));
    To.sendKeys("WARDHA");
    Thread.sleep(1000);
    To.click();

    // Open calendar
    WebElement calendarBtn = driver.findElement(By.xpath("//button[contains(@class,'MuiIconButton-root')]"));
    calendarBtn.click();
    String targetMonth = "September 2025";
/*
 // Loop until required month-year appears
 while (true) {
     String displayedMonthYear = driver.findElement(By.xpath("//div[contains(@id,':r0:-grid-label')]")).getText();
     System.out.println("Currently showing: " + displayedMonthYear);

     if (displayedMonthYear.equalsIgnoreCase(targetMonth)) {
         break;  // found month
     } else {
         // Click next month
         driver.findElement(By.xpath("//button[@aria-label='Next month']")).click();
     }
 }

 // Select specific date (example: 15 September 2025)
 driver.findElement(By.xpath("//button[@aria-label='15 September 2025']")).click();
*/
}}