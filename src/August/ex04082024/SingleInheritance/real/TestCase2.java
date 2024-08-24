package August.ex04082024.SingleInheritance.real;

public class TestCase2 extends BaseTest{
    void testCase2(){
        startBrowser();
        getDataFromSQL();
        System.out.println(gold);
        //Here we will write the test case
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
    }
}
