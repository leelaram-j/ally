package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver;

    public BasePage(){
        System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        driver = new ChromeDriver();
    }
}
