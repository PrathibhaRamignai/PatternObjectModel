package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
@RunWith(cucumber.class)
@CucumberOptions(features= {"src/test/java/features/Pom.feature"},glue="steps",tags= {"@smoke"},monochrome=true)


public class RunCreatLeadTest {

}
