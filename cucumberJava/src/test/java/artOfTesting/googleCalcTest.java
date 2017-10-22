package artOfTesting;

import cucumber.runtime.snippets.Snippet;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import sun.plugin2.main.server.Plugin;

@RunWith(Cucumber.class)
@Cucumber.Options(
        //Plugin = {"pretty", "html:target/test-report/report-html"},
        features ={"src\\test\\resources\\artOfTesting\\test\\googleCalc.feature"},
        strict = false,
        //glue = "src\test\java\artOfTesting\test\googleCalcStepDefinition.java",
        tags = {"@Test"}
)

public class googleCalcTest {
}
