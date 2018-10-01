package core;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DriverWrapper {
    private static WebDriver driver;

    public static WebDriver get() {
        return driver;
    }

    public static boolean isElementPresent(By locator) {
        get().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        List<WebElement> elements = get().findElements(locator);
        get().manage().timeouts().implicitlyWait(Config.DRIVER_TIMEOUT, TimeUnit.SECONDS);
        return elements.size() > 0 && elements.get(0).isDisplayed();
    }

    public static void set(WebDriver webDriver) {
        driver = webDriver;
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void wait(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}