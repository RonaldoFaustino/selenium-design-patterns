package com.seleniumdesign.factory;

import org.openqa.selenium.WebDriver;

public class GoogleFranch extends GoogleEnglish{


    public GoogleFranch(WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite() {
        this.driver.get("https://www.google.fr");
    }

}
