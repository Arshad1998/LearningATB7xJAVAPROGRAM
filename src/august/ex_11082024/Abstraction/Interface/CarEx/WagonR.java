package august.ex_11082024.Abstraction.Interface.CarEx;

public class WagonR implements Engine  {

    /*Interface can be implemented by a class not extends*/
    @Override
    public void startEngine() {

        System.out.println("WagonR is starting");

    }

    @Override
    public void stopEngine() {

        System.out.println("WagonR is stoping");

    }

    void drive(){
        startEngine();
        stopEngine();
    }


}

