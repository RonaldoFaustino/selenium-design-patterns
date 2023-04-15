package com.seleniumdesign.srp.common;

import com.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchSuggestion extends AbstractComponent {

    @FindBy(css = "li.sbct")
    private List<WebElement> susggestions;


    public SearchSuggestion(final WebDriver driver){
        super(driver);
    }

    public void clickSusggestionByIndex(int index){
        this.susggestions.get(index -1).click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.susggestions.size() > 5);
    }

    @Override
    public boolean isDisplayed(WebElement webElement) {
        return false;
    }
}
