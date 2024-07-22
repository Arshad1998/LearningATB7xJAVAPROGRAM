package ex_21072024;

public class Lab098 {
    public static void main(String[] args) {
        // JDK >= 13     break is not needed when we use arrow with Switch cases

        //java 13 enhancements -> https://www.geeksforgeeks.org/enhancements-for-switch-statement-in-java-13/

        int itemCode = 004;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

    }
}
