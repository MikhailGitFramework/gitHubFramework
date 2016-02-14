package Pages;

import helpers.DriverSingleTon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
    public static WebElement project;

    public void chooseProject(String projectName){
        project = DriverSingleTon.getDriver().findElement(By.xpath(
                String.format(".//li[contains(text(),public)]/a/span/span[@title='%s']",projectName)
        ));
        project.submit();
    }
}
