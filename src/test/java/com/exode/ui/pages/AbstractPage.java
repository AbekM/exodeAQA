package com.exode.ui.pages;

import com.exode.ui.driver.DriverSingleton;
import com.exode.ui.service.Waiter;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    protected Waiter wait;

    protected AbstractPage() {
        wait = new Waiter();
        PageFactory.initElements(DriverSingleton.getDriver(), this);
    }
}
