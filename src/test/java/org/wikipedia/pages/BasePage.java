package org.wikipedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wikipedia.utilities.BrowserUtils;
import org.wikipedia.utilities.Driver;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//span[text()='Contents']")
    public WebElement contentsMenu;


    @FindBy(id = "vector-main-menu-dropdown-checkbox")
    public WebElement menuDropDown;

    public void selectMenu(String menuName){
       menuDropDown.click();
        Driver.get().findElement(By.xpath("//span[text()='"+menuName+"']")).click();
    }

}
