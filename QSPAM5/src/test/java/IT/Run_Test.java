package IT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Run_Test {

	@Test
	public void run() throws InterruptedException {

		String url = System.getProperty("url");
		System.out.println(url);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Hello browser RT", true);
		System.out.println("Updated RT");
		System.out.println("Update 2 RT");
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		driver.quit();

	}
}
