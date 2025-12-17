package Action;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import dynamiccode.base;

public class MaouseAction extends base {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		launchbrowse("chrome");
		hiturl(""
				+ ""
				+ "");

		Actions ac = new Actions(driver);

		WebElement Mxplayer = driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_avod_desktop_topnav\"]"));
		ac.click(Mxplayer).build().perform();
		driver.navigate().back();
		Thread.sleep(3000);
		
		ac.moveToElement(Mxplayer).build().perform();
		ac.contextClick(Mxplayer).build().perform();
		ac.doubleClick(Mxplayer).build().perform();
		driver.navigate().back();
	
		WebElement sell = driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_sell_T3\"]"));
		ac.clickAndHold(sell).build().perform();

	
	}
}