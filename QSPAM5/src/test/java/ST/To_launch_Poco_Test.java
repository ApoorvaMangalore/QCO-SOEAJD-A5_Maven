package ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_launch_Poco_Test {

	@Test(groups = "mobile")
	public void poco() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.poco.in/");
		Thread .sleep(3000);
		Reporter.log("I am poco",true);
		driver.quit();
	}
}
