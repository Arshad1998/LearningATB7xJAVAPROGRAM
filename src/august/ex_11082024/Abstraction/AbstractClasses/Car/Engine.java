package august.ex_11082024.Abstraction.AbstractClasses.Car;

abstract class Engine extends GearBox {

    //abstract method should be incomplete(No body with implementations)
    abstract void StartTheEngine();

    //abstract can have return type but what it returns is provided during implementation from Sub class
    abstract String StopTheEngine();

    //if return type is provided while overriding we can have return statement


    // Concrete method inside Class
    public void DefaultEngineSetUp(){
        System.out.println("This is a default engine setup for all Cars");
    }



}
