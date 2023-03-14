package com.seleniumdesign.srp;

import org.openqa.selenium.WebElement;

public  abstract class AbstractComponent {

    public abstract boolean isDisplayed();

    public abstract boolean isDisplayed(WebElement webElement);
}
