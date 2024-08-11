package august.ex_04082024.Relationships.Inheritance.RealExample;

public class TestCase2 extends BaseTest{
    void testCase2(){
/*        We are calling functions without using reference inside the function of child class since
         it is an extends relationship  Go to son class in Multilevel inheritance for better understanding */

        startBrowser();// BaseTest (From main implicitly means TC2.testcase2.startBrowser()) -> that's why ref not needed explicitly
        getDataFromSQL(); // GrandBaseTest
        System.out.println(gold); // GrandBaseTest
        // Here we will write the TC
        closeBrowser();
    }


}
