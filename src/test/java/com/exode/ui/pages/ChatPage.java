package com.exode.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChatPage extends AbstractPage{

    @FindBy(xpath = "//span[@class='mr-1 text-ellipsis overflow-hidden']")
    WebElement chatSelectionButton;
    @FindBy(xpath = "//textarea")
    WebElement textarea;
    @FindBy(xpath = "//button[@aria-label='Отправить']")
    WebElement sendMessageButton;
    @FindBy(xpath = "(//span[@class='flex items-center whitespace-pre-wrap  '])[last()]")
    WebElement lastSendMessage;

    public ChatPage selectChat() {
        wait.waitUntilClickable(chatSelectionButton).click();
        return this;
    }

    public ChatPage inputTextIntoMessageField(String text) {
        wait.waitUntilClickable(textarea).sendKeys(text);
        return this;
    }

    public ChatPage sendMessage() {
        wait.waitUntilClickable(sendMessageButton).click();
        return this;
    }

    public String getLastMessageInChat() {
        return wait.waitUntilVisible(lastSendMessage).getText();
    }
}
