package com.exode.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage{

    @FindBy(xpath = "//div[@class='vkuiSimpleCell__main SimpleCell__main']//span[text() = 'Обучение']")
    WebElement settingsPageButton;
    @FindBy(xpath = "//div[@class='vkuiSimpleCell__main SimpleCell__main']//span[text() = 'Настройки']")
    WebElement chatPageButton;

    public SettingsPage navigateToSettingsPage() {
        wait.waitUntilClickable(settingsPageButton).click();
        return new SettingsPage();
    }

    public ChatPage navigateToChatPage() {
        wait.waitUntilClickable(chatPageButton).click();
        return new ChatPage();
    }
}
