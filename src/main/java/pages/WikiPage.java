package pages;

import org.openqa.selenium.By;

public class WikiPage extends BasePage implements IWikiPage{
    public static String seacrhXpath = "//i[@data-jsl10n='search-input-button']";

    public  void clickSearch() {
        driver.findElement(By.xpath(seacrhXpath)).click();
    }
}
