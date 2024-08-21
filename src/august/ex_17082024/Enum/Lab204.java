package august.ex_17082024.Enum;

public class Lab204 {
    public static void main(String[] args) {
        System.out.println(BUG.Low);
        System.out.println(BUG.Low.getBugStatus());

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
