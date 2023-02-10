package co.com.bianfa.prueba.mia.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //tags = "@Stories",
        //features = "src/test/resources/features/business.feature",
        //glue = "co.com.bianfa.prueba.mia.businessstepdefinitions",
        features = "src/test/resources/features/regions.feature",
        glue = "co.com.bianfa.prueba.mia.regionsstepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}