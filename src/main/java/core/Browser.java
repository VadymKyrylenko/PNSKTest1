package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Browser {
    public void BrowserInit() {
        System.setProperty("webdriver.chrome.driver", "C:/Programs/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
