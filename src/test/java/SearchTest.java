import org.testng.annotations.Test;
import pages.Pages;

public class SearchTest {
    @Test
    public void searchTest() {
        Pages.getWikiPage();
        Pages.getSpecialPage().clickSpecialSearchDropdown();
        Pages.getSpecialPage().enterSpecialSearchData("\"Father of OKRs\"");

    }
}
