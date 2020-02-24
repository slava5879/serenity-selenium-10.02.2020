package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.core.Every;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.SearchPage;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class SearchSteps extends ScenarioSteps {
    private SearchPage searchPage;

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



}
