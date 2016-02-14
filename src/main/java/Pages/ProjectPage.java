package Pages;

import helpers.DriverSingleTon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage {
    public static WebElement branch;
    @FindBy(xpath = ".//ul[@class = 'numbers-summary']/li[2]")
    WebElement branchesFrame;

    @FindBy(xpath = ".//div[@class='file-navigation in-mid-page']/a")
    WebElement newPullRequesButton;

    @FindBy(xpath = ".//nav/a[2]")
    WebElement goToIssuesFrame;

    @FindBy(xpath = ".//nav/a[1]")
    WebElement goToCodeFrame;

    @FindBy(xpath = ".//nav/a[3]")
    WebElement goToPullRequestsFrame;

    @FindBy(xpath = ".//nav/a[7]")
    WebElement goToSettingsFrame;

    public void chooseBranch(String branchName){
        branch = DriverSingleTon.getDriver().findElement(By.xpath(
                String.format(".//div[@class='select-menu-modal']//a[@data-name = '%s']", branchName )
        ));
        branch.submit();
    }
}
