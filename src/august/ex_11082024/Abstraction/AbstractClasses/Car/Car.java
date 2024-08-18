package august.ex_11082024.Abstraction.AbstractClasses.Car;

public class Car extends Engine{
    @Override
    void StartTheEngine() {
        System.out.println("Engine started");
    }

    @Override
    String StopTheEngine() {
        return "Engine stopped";
    }

    //Overridden methods from Engine we can do this inside Engine class as well
    @Override
    void Gear1() {
        System.out.println("Shifted to 1st Gear");
    }

    @Override
    void Gear2() {
        System.out.println("Shifted to 2nd Gear");
    }

    @Override
    void Gear3() {
        System.out.println("Shifted to 3rd Gear");
    }

    @Override
    void Gear4() {
        System.out.println("Shifted to 4th Gear");
    }


    @Override
    void ReverseGear() {

        System.out.println("Shifted to Reverse Gear");

    }

    @Override
    void SteerTheCar() {
            System.out.println("Steer the Car as required");

    }

    @Override
    void ApplyBreak() {

        System.out.println("Break applied as per need");
    }
}
