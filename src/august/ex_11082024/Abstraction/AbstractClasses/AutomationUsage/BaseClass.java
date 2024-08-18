package august.ex_11082024.Abstraction.AbstractClasses.AutomationUsage;

abstract class BaseClass extends GrandBaseClass {
    // Sample of Web Automation using Abstract Classes concept
    // Using Single Inheritance and hiding the Functionality of the open and close Browser.

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);
    BaseClass(){}

    @Override
    void takeScreenShot() {
        System.out.println("Ok Taking ScreenShot");
    }
}
