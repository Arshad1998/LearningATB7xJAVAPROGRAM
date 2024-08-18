package august.ex_11082024.Abstraction.AbstractClasses.AutomationUsage;

public class Chrome extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Chrome .....,         // This is code releted to chrome only\n");
        return browser;
    }

    //We can either override this method here or the other sub classes both Firefox and Chrome
    @Override
    String closeBrowser(String browser) {
        System.out.println("Close the Chrome .....,         // This is code releted to chrome only\n");
        return ""; //returning empty
    }


}
