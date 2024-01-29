package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class AmazonFirst extends BasePage {
    public AmazonFirst(WebDriver driver) {
        super(driver);
    }
    By search = By.cssSelector("#twotabsearchtextbox");
    By results = By.xpath("//*[@id='search']/span[2]/div/h1/div/div[1]/div/div/span[1]");


    public AmazonFirst enterSearch() {

        driver.findElement(search).sendKeys("harry potter and the order of the phoenix", Keys.ENTER);
        String result = driver.findElement(results).getText();
        String endResult = result.split(" ")[2];
        System.out.println("First Result = " + endResult);
        return this;

    }


}
