package ui;
import core.DriverWrapper;
import org.openqa.selenium.By;

public class ManageDriverAdminsPage {
    public static ManageDriverAdminsPage open() {
        DriverWrapper.get().get("https://driverqa.fleetinsight.com/driverportal/landing/driver-admin-management");
        return new ManageDriverAdminsPage();
    }

    public static boolean checkPageDisplayed() {
        return DriverWrapper.isElementPresent(By.xpath("//*[contains(text(),'To manage Fleet Admin accounts')]"));
    }
}
