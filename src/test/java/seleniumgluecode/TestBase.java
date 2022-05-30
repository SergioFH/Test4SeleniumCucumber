package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.ArticlePage;
import pom.HomePage;
import pom.SoftwareTestingPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();

    protected HomePage homePage = new HomePage(driver);

    protected ArticlePage articlePage = new ArticlePage(driver);

    protected SoftwareTestingPage softwareTestingPage = new SoftwareTestingPage(driver);

}
