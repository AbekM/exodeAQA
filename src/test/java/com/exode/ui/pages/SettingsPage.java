package com.exode.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends AbstractPage{

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement nameInputField;
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastNameInputField;
    @FindBy(xpath = "//div[@class='vkuiSimpleCell__content SimpleCell__content']/span[text()='Пароль']")
    WebElement passwordChangeFormOpenButton;
    @FindBy(xpath = "//input[@name='input.password']")
    WebElement newPasswordInputField;
    @FindBy(xpath = "//input[@name='input.confirmPassword']")
    WebElement confirmNewPasswordInputField;
    @FindBy(xpath = "//button//span[text()='Сохранить']")
    WebElement saveChangesButton;
    @FindBy(xpath = "//button//span[text()='Изменить']")
    WebElement changePasswordButton;

    public SettingsPage inputName(String name) {
        wait.waitUntilClickable(nameInputField).sendKeys(name);
        return this;
    }

    public SettingsPage inputSecondName(String secondName) {
        wait.waitUntilClickable(lastNameInputField).sendKeys(secondName);
        return this;
    }

    public SettingsPage saveChanges() {
        wait.waitUntilClickable(saveChangesButton).click();
        return this;
    }

    public SettingsPage changePassword(String password, String confirmPassword) {
        wait.waitUntilClickable(newPasswordInputField).sendKeys(password);
        wait.waitUntilClickable(confirmNewPasswordInputField).sendKeys(confirmPassword);
        return this;
    }
    public SettingsPage saveNewPassword() {
        wait.waitUntilClickable(changePasswordButton).click();
        return this;
    }

}
