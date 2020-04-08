package uk.org.wcht.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.org.wcht.basepage.BasePage;
import uk.org.wcht.browserselector.BrowserSelector;

import java.util.concurrent.TimeUnit;


public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();

    String baseUrl ="https://www.wcht.org.uk/";

    @BeforeMethod

    public void  openBrowser(){
        browserSelector.selectBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod

    public  void closeBrowser(){
        driver.quit();
    }
}
