package august.ex_04082024.AccessModifiers.Police;

public class JrCop {

    //But when CanIShoot method is private then JrCop(Class within same package cannot use it too)
    //Hence we can make it protected

    public static void main(String[] args) {
        Cop c = new Cop(200);
        c.CanIShoot(); //rcop can use since the CanIShoot is Protected class
    }



}
