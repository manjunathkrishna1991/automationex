package cucumberOptions;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
glue={"stepDevelopments"})
public class TestCreater extends AbstractTestNGCucumberTests{

}
