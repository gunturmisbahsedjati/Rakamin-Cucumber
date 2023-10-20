package cucumber.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumber/features/sortProducts.feature",
        glue = "cucumber.stepDef",
        plugin = {"html:target/sort_product_report.html"}
)
public class runSortProduct {
}
