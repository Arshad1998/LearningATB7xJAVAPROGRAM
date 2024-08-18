package august.ex_11082024.Abstraction.Interface.CarEx;

public class Lab189 {

    // Interface - Hide the implementation
    // Interface variables will be inherited to subclasses.
    // interface is a keyword which is used to define User Defined Datatypes.


    public static void main(String[] args) {
//        Engine e = new Engine(); //similar to abstract class we can create object for interface
        WagonR r = new WagonR();
        r.drive();
    }
}
