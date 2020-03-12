package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.core.Every;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.SearchPage;

import java.util.List;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;

public class SearchSteps extends ScenarioSteps {
    private SearchPage searchPage;

    @Then("I should see $searchTerm in each search result")
    @Step
    public SearchSteps verifyEachResultContains(String searchTerm) {
        List<String> searchResultList = searchPage.getSearchResultsList();
        // using loop
        // for (String searchResult: searchResultList) {
        //    Assert.assertTrue("SearchTerm not found", searchResult.toLowerCase().contains(searchTerm));
        //}

        // using Hamcrest matchers
        Assert.assertThat(searchResultList, Every.everyItem(containsString(searchTerm)));

        return this;
    }

    @Step
    public SearchSteps verifyEachResultContains(String[] searchTerm) {
        List<String> searchResultList = searchPage.getSearchResultsList();

        //Assert.assertThat(searchResultList, Every.everyItem(containsString(anyOf(searchTerm))));

        return this;
    }



}
