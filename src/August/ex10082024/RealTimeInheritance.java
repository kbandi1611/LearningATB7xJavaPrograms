package August.ex10082024;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1(); //Dynamic Dispatch
//        t1.setBrowser("opera", true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}
class TestCase1 extends BaseClass{
    TestCase1(){
        super();
        this.setBrowser("edge", true);
    }
    @Override

    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}

class BaseClass{
    BaseClass(){
        System.out.println("DC - Base Class");
    }
    BaseClass(String b){
        System.out.println("PC - Base Class");
    }

    private String Browser;

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth){
            this.Browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }
    void openBrowser(){
        System.out.println("Chrome Browser");
    }
    void openBrowser(String browserName){
        System.out.println("Open Browser ->" + browserName);
    }
    void closeBrowser(){
        System.out.println("Close Browser!!");
    }
}