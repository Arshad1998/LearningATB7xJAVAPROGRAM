package august.ex_04082024.General;

public class GeneralExample {

    String name;

    public GeneralExample() {
        System.out.println("DC is executed");
    }

    void talk()
    {
        System.out.println("Talking");
    }

    public static void main(String[] args) {
        System.out.println("main function executing a class having main function");
        System.out.println("Nothing executed");
    }

}
