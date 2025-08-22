package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamiccode.base;

public class staticdopdown extends base {

	public static void main(String[] args) throws InterruptedException {
		launchbrowser("chrome");
		hiturl("https://demo.automationtesting.in/Register.html");
JavascriptExecutor js=(JavascriptExecutor) driver;

js.executeScript("window.scrollBy(0,300)");
/*
WebElement dropdown = driver.findElement(By.cssSelector("select#Skills"));
dropdown.click();
Select select1=new Select(dropdown);
select1.selectByValue("Corel Draw");
dropdown.click();
*/

WebElement dynamic2= driver.findElement(By.xpath("//span/span[1]"));
WebElement dynamic3=driver.findElement(By.xpath("//span[3]"));
dynamic3.click();


	}

}
