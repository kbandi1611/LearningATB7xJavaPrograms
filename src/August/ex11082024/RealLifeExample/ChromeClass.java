package August.ex11082024.RealLifeExample;

public class ChromeClass extends BaseClass{
    @Override
    String openBrowser(String Browser) {
        System.out.println("Opening the Chrome Browser............");
        return Browser;
    }

    @Override
    String closeBrowser(String Browser) {
        System.out.println("Closing the Chrome Browser............");
        return Browser;
    }
}
