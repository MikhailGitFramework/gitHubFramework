package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleTon {

    private static WebDriver driver;

    private static DriverSingleTon driverSingleTon;

    private DriverSingleTon() {
        driver = new FirefoxDriver();
    }

    public static DriverSingleTon getInstance() {
        if (driverSingleTon == null) {
            driverSingleTon = new DriverSingleTon();
        }
        return driverSingleTon;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quit() {
        if (driverSingleTon != null) {
            driver.quit();
        }
    }

}
