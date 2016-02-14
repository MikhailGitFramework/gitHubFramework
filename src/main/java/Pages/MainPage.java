package Pages;
import helpers.DriverSingleTon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = ".//form[@class='logout-form']")
    WebElement logOutButton;

    @FindBy(xpath = ".//ul/a[@href='/new']")
    WebElement dropDownNewRepositoryButtun;

    @FindBy(xpath = ".//div[@class='message']//*[@href='/new']")
    WebElement newRepositoryMessageLink;

    @FindBy(xpath = ".//div[@class='boxed-group-action']//a")
    WebElement newRepositoryButton;

    public WebElement fintProject(String projectName){
        WebElement project = DriverSingleTon.getDriver().findElement(By.xpath
                (String.format(".//*[@id='repo_listing']/li/a/span/span[contains(text(),'%s')]", projectName)));
        return project;
    }


}
