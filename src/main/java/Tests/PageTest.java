package Tests;

import core.Config;
import core.Driver;
import core.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.*;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

//import org.junit.Assert;

public class PageTest {

    WebDriver driver;
    private FluentWait wait;

    @BeforeClass
    public void setUp() {
        WebDriver firefoxDriver = new FirefoxDriver();
        DriverWrapper.set(firefoxDriver);
    }


    @Test
    public void Requirement1() {
        //Login, open Manage Driver Admins page and verify that the Manage Driver Admins page is displayed
        LoginPage loginPage = LoginPage.open();
        LoginPage.performLogin();
        DriverWrapper.wait(10);
        ManageDriverAdminsPage.open();
        DriverWrapper.wait(10);
        Assert.assertTrue("Manage Driver Admins page is not displayed!", ManageDriverAdminsPage.checkPageDisplayed());
    }

    @Test
    public void Requirement2() {
        //Login, open Manage Drivers page and verify that the Manage Drivers page is displayed
        LoginPage loginPage = LoginPage.open();
        LoginPage.performLogin();
        DriverWrapper.wait(10);
        ManageDriversPage.open();
        DriverWrapper.wait(10);
        Assert.assertTrue("Manage Drivers page is not displayed!", ManageDriversPage.checkPageDisplayed());
    }

    @Test
    public void Requirement3() {
        //Login, open Drivers HOS page and verify that the Drivers HOS  page is displayed
        LoginPage loginPage = LoginPage.open();
        LoginPage.performLogin();
        // DriverWrapper.wait(10);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'video-tour-link__text')]")));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        DriversHOSPage.open();
        DriverWrapper.wait(10);
        Assert.assertTrue("Drivers HOS page is not displayed!", DriversHOSPage.checkPageDisplayed());
    }

    @Test
    public void Requirement4() {
        //Login, open Location Finder Settings page and verify that the Location Finder Settings  page is displayed
        LoginPage loginPage = LoginPage.open();
        LoginPage.performLogin();
        DriverWrapper.wait(10);
        LocationFinderSettingsPage.open();
        DriverWrapper.wait(10);
        Assert.assertTrue("Location Finder Settings page is not displayed!", LocationFinderSettingsPage.checkPageDisplayed());
    }

    @Test
    public void Requirement5() {
        //Burger Menu can be open by a user
        LoginPage loginPage = LoginPage.open();
        LoginPage.performLogin();
        DriverWrapper.wait(10);
        DriverWrapper.get().findElement(By.xpath("//*[@class='navigation-menu__toggle-icon']")).click();
    }


    @AfterClass
    public void cleanUp() {
    }
}


