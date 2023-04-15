package com.seleniumdesign.srp.result;

import com.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultStat extends AbstractComponent {

    @FindBy(id = "result-stats")
    private WebElement resultStatus;

    public ResultStat(WebDriver driver) {
        super(driver);
    }

    public String  getStatus(){
        return this.resultStatus.getText();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.resultStatus.isDisplayed());
    }

    @Override
    public boolean isDisplayed(WebElement webElement) {
        return false;
    }

}
