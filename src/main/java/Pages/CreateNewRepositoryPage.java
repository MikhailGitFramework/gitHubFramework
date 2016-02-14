package Pages;

import helpers.DriverSingleTon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewRepositoryPage {
    @FindBy(xpath = ".//*[@id='repository_name']")
    WebElement repositoryNameField;

    @FindBy(xpath = ".//*[@id='repository_description']")
    WebElement repositoryDescription;

    @FindBy(xpath = ".//button[@type='submit']")
    WebElement submitButton;

    public void setRepositoryPublic(){
        WebElement button = DriverSingleTon.getDriver().findElement(By.xpath(".//*[@id='repository_public_true']"));
        button.click();
    }
    public void setRepositoryPrivate(){
        WebElement button = DriverSingleTon.getDriver().findElement(By.xpath(".//*[@id='repository_public_false']"));
        button.click();
    }

    public void createNewRepository(String name, String description){
        repositoryNameField.sendKeys(name);
        repositoryDescription.sendKeys(description);
        submitButton.submit();
    }

    public void createNewRepository(String name){
        repositoryNameField.sendKeys(name);
        submitButton.submit();
    }

}
