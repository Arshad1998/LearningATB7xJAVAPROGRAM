package august.ex_04082024.Constructors.DefaultConstructor;

public class Person {

    String name;

    //Default Constructor - Special Method with no return type and executed automatically when Object is created
    Person()
    {
        System.out.println("Default Constructor called and executed");
    }

    void talk(){
        System.out.println("Talking");
    }
}
