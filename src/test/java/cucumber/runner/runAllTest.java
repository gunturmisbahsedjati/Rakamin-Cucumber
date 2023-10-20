package cucumber.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/cucumber/features/login.feature",
                "src/test/java/cucumber/features/sortProducts.feature",
                "src/test/java/cucumber/features/orderProduct.feature",
                "src/test/java/cucumber/features/failedDetailProduct.feature"},
        glue = "cucumber.stepDef",
        plugin = {"html:target/test_report.html"}
)
public class runAllTest {
}
