package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class HomePage  extends Utility {

    By yourHomeLink = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Your home')]");
    By findAHomeLink = By.xpath("//a[@class='header__nav-area-title'][contains(text(),'Find a home')]");

    public void mouseHoveryourHomeLink(){
        mouseHoverToElement(yourHomeLink);
    }

    public void mouseHoveryourfindHomeLink(){
        mouseHoverToElement(findAHomeLink);
    }
}
