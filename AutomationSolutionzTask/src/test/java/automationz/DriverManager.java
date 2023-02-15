package automationz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    public static void main(String[] args) {
        // Use WebDriverManager to automatically download and manage the latest version of ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Now you can use the "driver" object to control the Chrome browser via Selenium
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Quit the driver
        driver.quit();
    }
}
