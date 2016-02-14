package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = ".//*[@id='login_field']")
    WebElement loginField;

    @FindBy(xpath = ".//*[@id='password']")
    WebElement pswdField;

    @FindBy(xpath = ".//*[@id='login_field']")
    WebElement submitButton;

    @FindBy(className = "flash-full")
    WebElement flashError;

    public void login(String username, String passwrod){
        loginField.sendKeys(username);
        pswdField.sendKeys(passwrod);
        submitButton.submit();

    }


}
