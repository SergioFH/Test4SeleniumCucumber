package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriveManagerFactory;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverType;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

    private static WebDriver driver;

    private DriverManager driverManager;
    @Before
    public void setUp()throws IOException{
        Properties properties = new Properties();
        properties.load(new FileReader("src/test/resources/config.properties"));
        driverManager = DriveManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get(properties.getProperty("url_base"));
    }

    @After
    public void tearDown(Scenario scenario){
        driverManager.quitDriver();

    }

    public static WebDriver getDriver(){
        return driver;
    }
}
