package tests.base;

import common.CommonAction;
import common.Config;
import org.openqa.selenium.WebDriver;
import pages.amazon.AmazonFirst;
import pages.amazonsecond.AmazonSecond;

public class BaseTest {
    protected WebDriver driver = CommonAction.creatDriver();
    protected AmazonFirst Amazon = new AmazonFirst(driver);
    protected AmazonSecond Amazoneng = new AmazonSecond(driver);





}
