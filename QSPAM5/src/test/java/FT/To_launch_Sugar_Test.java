package FT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class To_launch_Sugar_Test {
	@Test(groups = "beauty")

	public void sugar() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://in.sugarcosmetics.com");
		driver.quit();
	}
}
