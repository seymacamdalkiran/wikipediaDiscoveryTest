package org.wikipedia.stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.wikipedia.pages.ResultsPage;

import java.util.List;

public class Results_StepDefs {
    @Then("Check the results")
    public void check_the_results() {
        ResultsPage resultsPage=new ResultsPage();
        List<String> strings = resultsPage.checkListOfResults();

    }
    @Then("Results should include {string} but not include {string}")
    public void results_should_include_but_not_include(String word, String notWord) {
        ResultsPage resultsPage=new ResultsPage();
        List<String> strings = resultsPage.checkListOfResults();
        String[] words = word.split(" ");
        String[] notWords = notWord.split(" ");
        boolean bl1=false;
        boolean bl2=false;

      label:  for (int i = 0; i < strings.size() ; i++) {
            for (int j = 0; j < words.length; j++) {
            if(strings.get(i).toLowerCase().contains(words[j].toLowerCase())){
                bl1=true;
            }
            else {
                System.out.println("i => "+i+"  strings.get(i) => " + strings.get(i));
                System.out.println("words[j] = " + words[j]);
                bl1=false;
                break label;
            }
        }
    }
        label:  for (int i = 0; i < strings.size() ; i++) {
            for (int j = 0; j < words.length; j++) {
                if(!strings.get(i).toLowerCase().contains(notWords[j].toLowerCase())){
                    bl2=true;
                }
                else {
                    System.out.println("i => "+i+"  strings.get(i) => " + strings.get(i));
                    System.out.println("words[j] = " + words[j]);
                    bl2=false;
                    break label;
                }
            }
        }

        System.out.println("bl1 = " + bl1);
        System.out.println("bl2 = " + bl2);

        Assert.assertTrue(bl1 && bl2);

    }
    @Then("Check the results {string} {string}")
    public void check_the_results(String word, String notWord) {
        ResultsPage resultsPage=new ResultsPage();
        List<String> strings = resultsPage.checkListOfResults();
        String[] words = word.split(" ");
        String[] notWords = notWord.split(" ");
        boolean bl1=false;
        boolean bl2=false;

        label:  for (int i = 0; i < strings.size() ; i++) {
            for (int j = 0; j < words.length; j++) {
                if(strings.get(i).toLowerCase().contains(words[j].toLowerCase())){
                    bl1=true;
                }
                else {
                    System.out.println("i => "+i+"  strings.get(i) => " + strings.get(i));
                    System.out.println("words[j] = " + words[j]);
                    bl1=false;
                    break label;
                }
            }
        }
        label:  for (int i = 0; i < strings.size() ; i++) {
            for (int j = 0; j < words.length; j++) {
                if(!strings.get(i).toLowerCase().contains(notWords[j].toLowerCase())){
                    bl2=true;
                }
                else {
                    System.out.println("i => "+i+"  strings.get(i) => " + strings.get(i));
                    System.out.println("words[j] = " + words[j]);
                    bl2=false;
                    break label;
                }
            }
        }

        System.out.println("bl1 = " + bl1);
        System.out.println("bl2 = " + bl2);

        Assert.assertTrue(bl1 && bl2);
    }
}
