package com.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchWidget extends AbstractComponent{

    private WebDriverWait wait;

    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver){
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
    }

    public void enter(String keyword){
        this.searchBox.clear();
        this.searchBox.sendKeys(keyword);
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public boolean isDisplayed(WebElement webElement) {
        this.wait.until(ExpectedConditions.invisibilityOf(webElement));
        return webElement.isDisplayed();
    }
}
