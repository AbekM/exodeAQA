package com.exode.ui.tests;

import com.exode.ui.driver.DriverSingleton;
import com.exode.ui.pages.LoginPage;
import com.exode.ui.service.RandomStringGenerator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChatTest {

    String textMessage = RandomStringGenerator.generateRandomString(30);

    @BeforeClass
    void setup() {
        DriverSingleton.getDriver();
    }
    @AfterClass
    void tearDown() {
        DriverSingleton.closeDriver();
    }

    @Test
    public void validateSendingTextInChat() {
        String sentMessage = new LoginPage()
            .openPage()
            .clickLoginWithEmailButton()
            .inputEmail()
            .clickSubmitButton()
            .inputPassword()
            .clickLogInButton()
            .navigateToChatPage()
            .selectChat()
            .inputTextIntoMessageField(textMessage)
            .sendMessage()
            .getLastMessageInChat();
        Assert.assertEquals(sentMessage, textMessage);
    }
}
