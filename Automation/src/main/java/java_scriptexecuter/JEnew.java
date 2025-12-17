package java_scriptexecuter;

import java.io.IOException;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamiccode.base;
import dynamiccode.base;

public class JEnew extends base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		launchbrowse("chrome");
		hiturl("https://www.railyatri.in/");

		JavascriptExecutor je = (JavascriptExecutor) driver;

		je.executeScript("window.scrollBy(0,500)");
		
		WebElement train = driver.findElement(By.cssSelector("input#trainField"));
		train.click();
		train.sendKeys("Nagpur");
		takescreenshot("railway", "trainenter");
		System.out.println(train.getText());
		train.clear();
		WebElement pnr = driver.findElement(By.cssSelector("input#getPNRChecked"));
		pnr.click();
		pnr.sendKeys("12345678910");
		takescreenshot("railway", "pnrentre");
	
		je.executeScript("window.scrollBy(0,document.body.scrollHeight)\r\n");
		driver.findElement(By.xpath("(//a[@class=\"materialUINewFooterAchorTag\"])[1]")).click();
		takescreenshot("railway", "trainstatus");
		je.executeScript("window.history.back()");
		je.executeScript("window.history.go(0)");
		je.executeScript("window.history.forward()");
		je.executeScript("window.history.back()");
	
	}
}