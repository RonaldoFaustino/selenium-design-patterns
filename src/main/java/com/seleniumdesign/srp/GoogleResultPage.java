package com.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {

    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;
    private NavegationBar navegationBar;
    private ResultStat  resultStat;

    public GoogleResultPage (final WebDriver driver){
        this.searchWidget = new SearchWidget(driver);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
        this.navegationBar = PageFactory.initElements(driver, NavegationBar.class);
        this.resultStat = PageFactory.initElements(driver, ResultStat.class);
    }

    SearchWidget getSearchWidget(){
        return searchWidget;
    }

    SearchSuggestion getSearchSuggestion(){
        return searchSuggestion;
    }

    public NavegationBar getNavegationBar(){
        return navegationBar;
    }

    ResultStat getResultStat(){
        return resultStat;
    }
}
