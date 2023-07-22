package com.exode.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends AbstractPage{

    @FindBy(xpath = "//h1[@class='vkuiTitle Title vkuiTitle--l-1 Title--l-1 vkuiTitle--w-3 Title--w-3']")
    WebElement profileNameAndSurname;

    public String getProfileFullName() {
        return wait.waitUntilVisible(profileNameAndSurname).getText();
    }
}
