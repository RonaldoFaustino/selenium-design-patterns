package com.seleniumdesign.srp.result;

import com.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavegationBar extends AbstractComponent {

    @FindBy(id = "top_nav")
    private WebElement bar;

    @FindBy(linkText = "Imagens")
    private WebElement imagens;

    @FindBy(linkText = "Notícias")
    private WebElement noticias;

    public NavegationBar(WebDriver driver) {
        super(driver);
    }

    public void goToImagens(){
        this.imagens.click();
    }

    public void goToNews(){
        this.noticias.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.bar.isDisplayed());
    }

    @Override
    public boolean isDisplayed(WebElement webElement) {
        return false;
    }


}
