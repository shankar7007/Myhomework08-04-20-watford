package uk.org.wcht.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

public class MouseHoverTestCase extends TestBase{

    HomePage homePage = new HomePage();

    @Test

    public  void varifyMouseHoverActionOnYourHomeLink(){
    homePage.mouseHoveryourHomeLink();
    }

    @Test
    public void varifyMouseHoverActionOnFindAhomeLink(){
        homePage.mouseHoveryourfindHomeLink();

    }
}
