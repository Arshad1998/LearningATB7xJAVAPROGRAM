package august.ex_11082024.Abstraction.AbstractClasses.AutomationUsage;

public class Lab188 {

    public static void main(String[] args) {
        Chrome c = new Chrome();
        String s = c.openBrowser("Chrome");
        System.out.println(s);
        c.closeBrowser("Chrome");

        FireFox f = new FireFox();
        f.openBrowser("ff");
        f.closeBrowser("ff");
        f.takeScreenShot();
    }
}
