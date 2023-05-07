package org.wikipedia.stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.wikipedia.pages.ContentPage;

public class Content_StepDefs {


    @Given("Click the menu dropdown and Seleck the {string} menu")
    public void click_the_menu_dropdown_and_Seleck_the_menu(String menuName) {
        ContentPage contentPage=new ContentPage();
        contentPage.selectMenu(menuName);
    }

    @When("Configure {string} language")
    public void configure_language(String language) {
        ContentPage contentPage=new ContentPage();
        contentPage.chooseLanguage(language);
    }
    @Then("Verify that {string} is selected")
    public void verify_that_is_selected(String string) {
        ContentPage contentPage=new ContentPage();
        String text = contentPage.head.getText();
        System.out.println("text = " + text);
        boolean b = text.startsWith(string);
        System.out.println("b = " + b);
        Assert.assertTrue(b);
    }
}
