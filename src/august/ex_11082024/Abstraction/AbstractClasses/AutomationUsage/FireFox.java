package august.ex_11082024.Abstraction.AbstractClasses.AutomationUsage;

public class FireFox extends BaseClass {
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the FIREFOX .....,         // This is code releted to FIREFOX only\n");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Closing the FIREFOX .....,         // This is code releted to FIREFOX only\n");
        return "";
    }
}
