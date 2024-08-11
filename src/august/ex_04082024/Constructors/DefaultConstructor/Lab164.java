package august.ex_04082024.Constructors.DefaultConstructor;

public class Lab164 {
    public static void main(String[] args) {

        Car c1 = new Car();

        Car c2; //This won't call the DC bcoz Object is not created
        c2 = new Car(); //now it will be called
        //DC will be created only when new ClassName() is given it cannot be called using ref like a normal function

        c1.Car(); //calling normal method having name same as class

        new Car();
        new Car();
        new Car();

        //3 objects created without reference and DC is called 3 more times




    }


}
