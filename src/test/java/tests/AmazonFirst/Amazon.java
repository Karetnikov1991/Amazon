package tests.AmazonFirst;

import org.testng.annotations.Test;
import pages.amazon.AmazonFirst;
import pages.base.BasePage;
import tests.base.BaseTest;

public class Amazon extends BaseTest {




    @Test

    public void resultQuantity() {
            BasePage.open("https://www.amazon.com/");
            Amazon.enterSearch();
    }
    @Test
    public void resultQuantitysecond() {
        BasePage.open("https://www.amazon.com/");
        Amazoneng.enterSearchh();//if this code works I'm in heaven
    }
}
