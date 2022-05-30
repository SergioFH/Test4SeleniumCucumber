package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticlePage extends BasePage{

    private By searchBox = By.id("searchInput");
    private By search = By.name("go");

    private  String boxString = "software testing";

    public ArticlePage(WebDriver driver){
        super(driver);
    }

    public void pageSoftwareTesting() throws Exception{
        this.boxText(searchBox,boxString);
        this.click(search);
    }
}
