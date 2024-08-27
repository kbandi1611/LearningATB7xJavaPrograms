package August.ex11082024.RealLifeExample;

abstract class BaseClass extends GrandBaseClass {
    // Web Automation
    // Single Inheritance
    // Hide the Functionality of the open and close Browser.

    abstract String openBrowser(String Browser);
    abstract String closeBrowser(String Browser);

    BaseClass(){};

    @Override
    void takeScreenShot() {
        System.out.println("OK Taking Screenshot");
    }
}
