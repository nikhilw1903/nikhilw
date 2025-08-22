package Action;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import dynamiccode.Dynamic;

public class MaouseAction extends Dynamic {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		launchbrowse("chrome");
		hiturl("https://www.amazon.in/");

		Actions ac = new Actions(driver);
/*
		WebElement Mxplayer = driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_avod_desktop_topnav\"]"));
		ac.click(Mxplayer).build().perform();
		driver.navigate().back();
		Thread.sleep(3000);
		
		ac.moveToElement(sell).build().perform();
		ac.contextClick(sell).build().perform();
		ac.doubleClick(sell).build().perform();
		driver.navigate().back();
	*/
		WebElement sell = driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_sell_T3\"]"));
//		ac.clickAndHold(sell).build().perform();

	
	}
}