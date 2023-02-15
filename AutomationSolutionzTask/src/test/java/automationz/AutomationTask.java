package automationz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTask {
	WebDriver driver;
	@Test(enabled=true)
	public void firstMethod() {

		WebDriverManager.chromedriver().setup();

		// Now you can use the "driver" object to control the Chrome browser via Selenium
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.zeuz.ai/web/level/one/actions/save_text");
		String text = driver.findElement(By.id("randomText")).getText();
		driver.findElement(By.id("enter_text")).sendKeys(text);
		driver.findElement(By.id("verify_id")).click();

		String VerifyStatus = driver.findElement(By.id("text_showing")).getText();
		Assert.assertEquals("You have successfully verified the text",VerifyStatus);
	}
}