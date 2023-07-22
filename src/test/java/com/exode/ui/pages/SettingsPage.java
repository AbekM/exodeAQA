package com.exode.ui.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

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
        wait.waitUntilClickable(nameInputField).sendKeys(Keys.CONTROL + "A");
        nameInputField.sendKeys(name);
        return this;
    }

    public SettingsPage inputSecondName(String secondName) {
        wait.waitUntilClickable(lastNameInputField).sendKeys(Keys.CONTROL + "A");
        lastNameInputField.sendKeys(secondName);
        return this;
    }

    public HomePage saveChanges() {
        wait.waitUntilClickable(saveChangesButton).click();
        return new HomePage();
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

    public boolean buttonActive() {
        return saveChangesButton.isEnabled();
    }

}
