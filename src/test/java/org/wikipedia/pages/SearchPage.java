package org.wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//label[.='Advanced search:']")
    public WebElement advancedSearch;

    @FindBy(xpath = "//input[@id='ooui-php-1']")
    public WebElement searchInput;

    @FindBy(xpath = "//input[@id='ooui-33']")
    public WebElement theseWords;

    @FindBy(xpath = "//input[@id='ooui-37']")
    public WebElement exactlyThisText;

    @FindBy(xpath = "//input[@id='ooui-41']")
    public WebElement notTheseWords;

    @FindBy(xpath = "//input[@id='ooui-45']")
    public WebElement oneOfTheseWords;

    @FindBy(xpath = "//button[@class='oo-ui-inputWidget-input oo-ui-buttonElement-button']")
    public WebElement searchButton;






}
