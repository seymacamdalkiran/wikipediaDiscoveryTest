package org.wikipedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.wikipedia.utilities.BrowserUtils;

import java.util.List;

public class ResultsPage extends BasePage{
    @FindBy(xpath = "//td[@class='searchResultImage-text']")
    public List<WebElement> results;

    public List<String> checkListOfResults(){
        return BrowserUtils.getElementsText(results);
    }
}
