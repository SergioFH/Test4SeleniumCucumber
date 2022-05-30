package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.PriorityQueue;

public class HomePage extends BasePage{

    private By changeEnglish = By.xpath("//*[@id=\"p-lang\"]/div/ul/li[16]/a");
    private By pageArticle = By.xpath("//*[@id=\"mp-otd\"]/ul/li[1]/b/a");
    private By onThisDay = By.id("On_this_day");
    private String titleHomePageES = "Wikipedia, la enciclopedia libre";
    private String titleHomePageEN = "Wikipedia, the free encyclopedia";

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void clickOnEnglish()throws Exception{
        this.click(changeEnglish);
    }

    public boolean homePageEsIsDisplay() throws Exception{
        return this.getTitle().equals(titleHomePageES);
    }

    public boolean homePageEnIsDisplay() throws Exception{
        return this.getTitle().equals(titleHomePageEN);
    }

    public void ArticlePage()throws Exception{
        this.click(pageArticle);
    }
}
