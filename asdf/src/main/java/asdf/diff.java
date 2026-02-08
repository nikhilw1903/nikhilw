package asdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class diff {

	public static void main(String[] args) {
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.ilovepdf.com/pdf_to_excel");
		
		driver2.manage().window().maximize();
		
		
	}

}
