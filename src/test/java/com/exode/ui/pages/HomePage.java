package com.exode.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{

    @FindBy(xpath = "//span[text() = 'Настройки']/ancestor::div[@role='button']")
    WebElement settingsPageButton;
    @FindBy(xpath = "//div[@class='vkuiSimpleCell__main SimpleCell__main']//span[text() = 'Общение (β)']")
    WebElement chatPageButton;
    @FindBy(xpath = "//div[@class='sc-dmctIk hsugIO mr-3 ']")
    WebElement profilePageButton;

    public SettingsPage navigateToSettingsPage() {
        wait.waitUntilClickable(settingsPageButton).click();
        return new SettingsPage();
    }

    public ChatPage navigateToChatPage() {
        wait.waitUntilClickable(chatPageButton).click();
        return new ChatPage();
    }

    public ProfilePage navigateToProfilePage() {
        wait.waitUntilClickable(profilePageButton).click();
        return new ProfilePage();
    }
}
