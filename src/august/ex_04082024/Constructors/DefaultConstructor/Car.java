package august.ex_04082024.Constructors.DefaultConstructor;

public class Car {

//   DC -> Shortcut (Right Click -> Generate DC) or (Alt+insert)
//   Constructor can only be created using the name same as class name
//   if the class is public and we make the DC as public then we can call it from other packages
    public Car() {
        System.out.println("Engine Starts");
    }

    // We cannot create 2 DC
//    Car()
//    {
//
//    }

    //We can create a normal method with name same as CLass
    void Car ()
    {
        System.out.println("We can create a normal method with name same as Class. This will not be automatically like DC" +
                " and " + "this is not recommended");
    }

}
