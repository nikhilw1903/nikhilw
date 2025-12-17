package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamiccode.base;

public class ca extends base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 // Launch browser
        launchbrowse("chrome");
        hiturl("https://www.railyatri.in/");

        Actions ac= new Actions(driver);
        // Scroll down for visibility
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");

        
//        start
        WebElement from = driver.findElement(By.xpath("//input[@id=\"TrainFromSourceField\"]"));
       from.click();
        from.sendKeys("Nagpur");
        
      driver.findElement(By.xpath("//span[text()=\"NGP\"]//self::span")).click();
        
//        end
     WebElement end = driver.findElement(By.xpath("//input[@id='toSourceField']"));
     end.click();
        end.sendKeys("Pune");
        driver.findElement(By.xpath("//span[text()=\"PUNE\"]//self::span")).click();
        
     // Scroll down for visibility
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,100)");

        // Open the calendar
        WebElement calender = driver.findElement(By.xpath("//label[text()=\"Date\"]"));
        calender.click();

        int date = 2;  
     
        while (true) {
            // Capture the current month and year
            String month_year = driver.findElement(By.xpath("//div[text()=\"December 2025\"]")).getText();
            System.out.println("Current month and year: " + month_year);

            // Check if current matches desired
            if (!(month_year.equalsIgnoreCase("November 2025"))) {
                // Click next button
                driver.findElement(By.xpath("//button[@title=\"Next month\"]")).click();
            } else {
                break;
            }
        }

        // Select the date
        driver.findElement(By.xpath("//button[text()="+date+"]")).click();

        // Print the selected date from input box
        System.out.println("Selected date is: " + calender.getAttribute("value"));

       WebElement search = driver.findElement(By.xpath("//button[@id='search_btn_dweb']"));
       
	search.click();
	
	
	
	}
	

}
