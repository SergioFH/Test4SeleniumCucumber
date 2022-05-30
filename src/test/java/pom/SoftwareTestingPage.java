package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SoftwareTestingPage extends BasePage{

    private By titleSotwarePage = By.id("firstHeading");
    private String title = "Software testing";

    private By returnHomePage = By.xpath("//*[@id=\"p-logo\"]/a");


    public SoftwareTestingPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleDisplayed()throws Exception{
        return this.isDisplayed(titleSotwarePage) && this.getText(titleSotwarePage).equals(title);
    }

    public void returnPage()throws Exception{
        this.click(returnHomePage);
    }

}
