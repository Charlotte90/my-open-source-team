import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Projects/java-16b-practice-repo/WebTest01/src/test/resources/magentofeatures/M002CustStoreSearch.feature"},
plugin = {"json:target/cucumber-parallel/2.json", "html:target/cucumber-parallel/2.html"},
monochrome = false,
 tags = {"@wip"}, glue = { "com.magento" })
public class Parallel02IT {
}
