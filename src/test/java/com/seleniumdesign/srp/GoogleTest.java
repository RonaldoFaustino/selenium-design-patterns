package com.seleniumdesign.srp;

import com.seleniumdesign.srp.common.SearchWidget;
import com.seleniumdesign.srp.main.GoogleMainPage;
import com.seleniumdesign.srp.result.GoogleResultPage;
import com.seleniumdesign.srp.common.SearchSuggestion;
import com.seleniumdesign.Base;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleTest extends Base {

    private GoogleMainPage googleMainPage;
    private GoogleResultPage googleResultPage;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    @FindBy(name = "q")
    private WebElement searchBox;

    @Before
    public void setupPages(){
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleResultPage = new GoogleResultPage(driver);
        this.searchWidget = new SearchWidget(driver);
        this.searchSuggestion = new SearchSuggestion(driver);
    }

    @Test
    public void googleWorkFlow(){

        googleMainPage.goTo();
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());
        //googleMainPage.getSearchWidget().isDisplayed(searchBox);

        googleMainPage.getSearchWidget().enter("Selenium WebDriver");
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());

        googleMainPage.getSearchSuggestion().clickSusggestionByIndex(1);
        Assert.assertTrue(googleResultPage.getNavegationBar().isDisplayed());

        googleResultPage.getSearchWidget().enter("Selenium WebDriver");
        Assert.assertTrue(googleResultPage.getSearchSuggestion().isDisplayed());

        googleResultPage.getSearchSuggestion().clickSusggestionByIndex(1);
        googleResultPage.getNavegationBar().isDisplayed();
        googleResultPage.getNavegationBar().goToNews();

        googleResultPage.getResultStat().isDisplayed();

        System.out.println(
                googleResultPage.getResultStat().getStatus()
        );
    }
}
