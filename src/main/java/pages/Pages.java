package pages;

public class Pages {
    public static IWikiPage getWikiPage() {
        return new WikiPage();
    }

    public static ISpecialPage getSpecialPage() {
        return new SpecialPage();
    }

}
