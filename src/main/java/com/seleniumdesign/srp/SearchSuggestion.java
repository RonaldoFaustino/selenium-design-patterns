package com.seleniumdesign.srp;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchSuggestion extends AbstractComponent{

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
