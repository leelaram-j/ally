package pages;

import org.openqa.selenium.By;

public class SpecialPage extends BasePage implements ISpecialPage {
    public static String specialSearchDropDownXpath = "//a[@class='oo-ui-buttonElement-button']/span[3]";
    public static String searchFieldXpath = "//label[contains(text(),'Exactly this text')]//parent::span/following-sibling::div[1]/div[1]/input";

    public void clickSpecialSearchDropdown() {
        driver.findElement(By.xpath(specialSearchDropDownXpath)).click();
    }


    public void enterSpecialSearchData(String input) {
        driver.findElement(By.xpath(searchFieldXpath)).clear();
        driver.findElement(By.xpath(searchFieldXpath)).sendKeys(input);
        driver.findElement(By.xpath(searchFieldXpath)).submit();
    }

}
