package august.ex_11082024.Example_enum;

import august.ex_17082024.Enum.BUG;
import august.ex_17082024.Enum.Colors;
import august.ex_17082024.Enum.Pages;

//  We can use enums from different packages using import statements

public class Lab205 {
    public static void main(String[] args) {
        System.out.println(BUG.Low);
        System.out.println(BUG.Low.getBugStatus()); //methods should be public in enum

        //      Using constants from Pages enum

        System.out.println(Pages.LOGINPAGE);
        System.out.println(Pages.CHATBOTPAGE);
        System.out.println(Pages.SUPPORTPAGE);
        System.out.println("--------------------------------\n");

//      Using constants from Colors enum

        System.out.println(Colors.RED);
        System.out.println(Colors.GREEN);
        System.out.println(Colors.BLUE);
    }
}
