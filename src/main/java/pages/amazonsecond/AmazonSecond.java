package pages.amazonsecond;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class AmazonSecond extends BasePage {
    public AmazonSecond(WebDriver driver) {
        super(driver);
    }
    By search = By.cssSelector("#twotabsearchtextbox");
    By book = By.xpath("//*[@id='topRefinements/0']/ul/span/span[1]/li/span/a/span");
    By english = By.xpath("//*[@id='p_n_feature_nine_browse-bin/3291437011']/span/a/span");
    By results = By.xpath("//*[@id='search']/span[2]/div/h1/div/div[1]/div/div/span[1]");


    public AmazonSecond enterSearchh() {

        driver.findElement(search).sendKeys("harry potter and the order of the phoenix", Keys.ENTER);
        driver.findElement(book).click();
        driver.findElement(english).click();
        String result = driver.findElement(results).getText();
        String endResult = result.split(" ")[2];
        System.out.println("Second Result = " + endResult);


        return this;

    }


}