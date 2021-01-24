package pages;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage implements ISearchPage {
    public static String title1 = "OKR";
    public static String title2 = "Andrew Grove";

    public static String resultCountXpath = "//li[@class='mw-search-result']";
    public int getHeaderCount = driver.findElements(By.xpath(resultCountXpath)).size();
    List<String> headerNames = new ArrayList<>();

//    public static void getHeaderNames() {
//        for(int i=1;i=<getHeaderCount;i++) {
//            headerNames.
//        }
//
//    }

//    public static String searchHeader1Xpath = "//li[@class='mw-search-result'][1]/div/a";
//    public static String searchHeader2Xpath = "//li[@class='mw-search-result'][2]/div/a";
//



}
