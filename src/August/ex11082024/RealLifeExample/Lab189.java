package August.ex11082024.RealLifeExample;

public class Lab189 {
    public static void main(String[] args) {
        ChromeClass chromeClass = new ChromeClass();
        String s = chromeClass.openBrowser("Chrome");
        System.out.println(s);
        chromeClass.closeBrowser("Chrome");

        FirefoxClass firefoxClass = new FirefoxClass();
        firefoxClass.openBrowser("Firefox");
        firefoxClass.closeBrowser("Firefox");
        firefoxClass.takeScreenShot();

    }
}
