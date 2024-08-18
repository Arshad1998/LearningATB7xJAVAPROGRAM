package august.ex_11082024.Abstraction.AbstractClasses.Car;

public class WagonR extends Car {

    void drive(){
        StartTheEngine();

        Gear1();
        SteerTheCar();
        Gear2();
        SteerTheCar();
        Gear3();
        SteerTheCar();
        ApplyBreak();
        Gear2();
        ApplyBreak();
        Gear1();


        String StopTheEngine = StopTheEngine();
        System.out.println(StopTheEngine);
    }
}
