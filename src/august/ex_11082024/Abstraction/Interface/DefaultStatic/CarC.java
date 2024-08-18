package august.ex_11082024.Abstraction.Interface.DefaultStatic;

public class CarC implements EngineE {

    @Override
    public void startEngine() {
        System.out.println("starting");

    }

    @Override
    public void stopEngine() {

        System.out.println("Stopping");
    }

    @Override
    public void m2() {
        System.out.println("m2");

    }

    @Override
    public void m3() {

        System.out.println("m3");
    }
}
