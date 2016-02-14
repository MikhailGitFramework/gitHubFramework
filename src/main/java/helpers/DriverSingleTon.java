package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingleTon {

    public static WebDriver driver;

    public DriverSingleTon(){
    }

    public static WebDriver getDriver(){
        if(driver == null){
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
        }
    }

}
