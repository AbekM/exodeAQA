package com.exode.ui.pages;

import com.exode.ui.driver.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage{

    public LoginPage() {
        DriverSingleton.getDriver().get("https://staging.exode.ru/login");
    }
    @FindBy(xpath = "//button[@data-test='auth.login.loginViaEmail']")
    WebElement emailLoginButton;
    @FindBy(xpath = "//input[@name='login']")
    WebElement emailInputField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInputField;

    public LoginPage clickLoginWithEmailButton() {
        wait.waitUntilClickable(emailLoginButton).click();
        return this;
    }
    public LoginPage inputEmail() {
        wait.waitUntilVisible(emailInputField).sendKeys("abek.makhmudov@gmail.com");
        return this;
    }

    public LoginPage inputPassword() {
        wait.waitUntilVisible(passwordInputField).sendKeys("ыуауыываыва");
        return this;
    }

    public LoginPage clickSubmitButton() {
        wait.waitUntilClickable(submitButton).click();
        return this;
    }

    public HomePage clickLogInButton() {
        wait.waitUntilClickable(submitButton).click();
        return new HomePage();
    }
}
