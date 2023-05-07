package org.wikipedia.stepDefinitions;

import io.cucumber.java.en.*;
import org.wikipedia.pages.SearchPage;
import org.wikipedia.utilities.ConfigurationReader;
import org.wikipedia.utilities.Driver;

public class Search_StepDefs {
    @Given("Go to the url")
    public void go_to_the_url() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("Select advanced search")
    public void select_advanced_search() {
        SearchPage searchPage=new SearchPage();
        searchPage.advancedSearch.click();
    }

    @When("Write {string} in these words box")
    public void write_in_these_words_box(String string) {
        SearchPage searchPage=new SearchPage();
        searchPage.theseWords.sendKeys(string);
    }


    @When("Write {string} in not these words box")
    public void write_in_not_these_words_box(String string) {
        SearchPage searchPage=new SearchPage();
        searchPage.notTheseWords.sendKeys(string);
    }

    @When("Click the search button")
    public void click_the_search_button() {
        SearchPage searchPage=new SearchPage();
        searchPage.searchButton.click();
    }

}
