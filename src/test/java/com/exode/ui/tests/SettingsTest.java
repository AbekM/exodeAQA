package com.exode.ui.tests;

import com.exode.ui.driver.DriverSingleton;
import com.exode.ui.pages.LoginPage;
import com.exode.ui.service.RandomStringGenerator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SettingsTest {

    String randomName = RandomStringGenerator.generateRandomString(10);
    String randomLastName = RandomStringGenerator.generateRandomString(10);

    @BeforeClass
    void setup() {
        DriverSingleton.getDriver();
    }
    @AfterClass
    void tearDown() {
        DriverSingleton.closeDriver();
    }

    @Test
    public void saveValidSettingsParameters() {
        String fullName = new LoginPage()
            .openPage()
            .clickLoginWithEmailButton()
            .inputEmail()
            .clickSubmitButton()
            .inputPassword()
            .clickLogInButton()
            .navigateToSettingsPage()
            .inputName(randomName)
            .inputSecondName(randomLastName)
            .saveChanges()
            .navigateToProfilePage()
            .getProfileFullName();
        Assert.assertEquals(fullName.split(" ")[0], randomName);
        Assert.assertEquals(fullName.split(" ")[1], randomLastName);
    }

    @Test
    public void saveInvalidSettingsParameters() {
        String fullName = new LoginPage()
            .openPage()
            .clickLoginWithEmailButton()
            .inputEmail()
            .clickSubmitButton()
            .inputPassword()
            .clickLogInButton()
            .navigateToSettingsPage()
            .inputName(" ")
            .inputSecondName("sfsdfsdfsasdfgsdf")
            .saveChanges()
            .navigateToProfilePage()
            .getProfileFullName();
        Assert.assertNotEquals(fullName.split(" ")[0], randomName);
        Assert.assertNotEquals(fullName.split(" ")[1], randomLastName);
    }
}
