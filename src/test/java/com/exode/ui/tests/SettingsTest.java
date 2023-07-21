package com.exode.ui.tests;

import com.exode.ui.driver.DriverSingleton;
import com.exode.ui.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SettingsTest {

    @BeforeClass
    void setup() {
        DriverSingleton.getDriver();
    }
    @AfterClass
    void tearDown() {
        DriverSingleton.closeDriver();
    }

    @Test
    public void loginWithValidCredentials() {
        new LoginPage().clickLoginWithEmailButton().inputEmail().clickSubmitButton().inputPassword().clickLogInButton();
    }
}
