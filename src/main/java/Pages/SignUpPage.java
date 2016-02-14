package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    @FindBy(xpath = ".//input[@name='user[login]']")
    WebElement loginField;

    @FindBy(xpath = ".//input[@name='user[email]']")
    WebElement emailField;

    @FindBy(xpath = ".//input[@name='user[password]']")
    WebElement pswdField;

    @FindBy(xpath = ".//button[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = ".//a[@href='/login']")
    WebElement goToLoginPageButton;

    public void signUp(String login, String email, String pswd){
        loginField.sendKeys(login);
        emailField.sendKeys(email);
        pswdField.sendKeys(pswd);
        submitButton.submit();

    }


    public void setGoToLoginPage(){
        goToLoginPageButton.submit();
    }
}
