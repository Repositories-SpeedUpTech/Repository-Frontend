package qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add-passengers.feature"
        ,glue = "qa.stepdefinitions"
        , snippets = SnippetType.CAMELCASE)
public class AddPassengersRunner {
}
