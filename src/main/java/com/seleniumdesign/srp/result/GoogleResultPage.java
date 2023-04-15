package com.seleniumdesign.srp.result;

import com.seleniumdesign.srp.common.SearchSuggestion;
import com.seleniumdesign.srp.common.SearchWidget;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {

    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;
    private NavegationBar navegationBar;
    private ResultStat resultStat;

    public GoogleResultPage (final WebDriver driver){
        this.searchWidget = new SearchWidget(driver);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
        this.navegationBar = PageFactory.initElements(driver, NavegationBar.class);
        this.resultStat = PageFactory.initElements(driver, ResultStat.class);
    }

    public SearchWidget getSearchWidget(){
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion(){
        return searchSuggestion;
    }

    public NavegationBar getNavegationBar(){
        return navegationBar;
    }

    public ResultStat getResultStat(){
        return resultStat;
    }
}
