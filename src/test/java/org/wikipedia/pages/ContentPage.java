package org.wikipedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.wikipedia.utilities.Driver;

public class ContentPage extends BasePage{
    @FindBy (id = "p-lang-btn-checkbox")
    public WebElement languages;

    @FindBy(xpath = "//button[text()='Add languages']")
    public WebElement addLanguages;

    @FindBy(xpath = "//span//span[text()='Edit interlanguage links']")
    public WebElement editInterlanguage;

    @FindBy(xpath = "//a[text()='Configure']")
    public WebElement configure;

    @FindBy(id = "firstHeading")
    public WebElement head;
    @FindBy(xpath = "//li//span[text()='Türkçe']")
    public WebElement turkce;

    public void chooseLanguage(String language){
        languages.click();
        addLanguages.click();
        editInterlanguage.click();
        configure.click();
        Driver.get().findElement(By.xpath("//a[text()='"+language+"']")).click();

    }

}
