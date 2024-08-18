package august.ex_11082024.Abstraction.AbstractClasses.Car;

public class Lab186 {
    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        System.out.println("Tesla Car- Test Drive");
        tesla.drive();
        //Tesla can call the concrete method of Abstract Engine Class
        tesla.DefaultEngineSetUp();

        System.out.println("\n-------------------------------\n");

        i20 i20 = new i20();
        System.out.println("i20 Car- Test Drive");
        i20.drive();
        //Tesla can call the concrete method of Abstract Engine Class
        i20.DefaultEngineSetUp();


        System.out.println("\n-------------------------------\n");


        WagonR wagonR = new WagonR();
        System.out.println("WagonR Car- Test Drive");
        wagonR.drive();
        //Tesla can call the concrete method of Abstract Engine Class
        wagonR.DefaultEngineSetUp();
    }
}
