import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Projects/java-16b-practice-repo/WebTest01/src/test/resources/magentofeatures/M001CustomerLogin.feature"},
plugin = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html"},
monochrome = false,
 tags = {"@wip"}, glue = { "com.magento" })
public class Parallel01IT {
}
