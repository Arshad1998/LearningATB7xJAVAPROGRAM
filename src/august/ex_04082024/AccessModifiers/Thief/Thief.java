package august.ex_04082024.AccessModifiers.Thief;

import august.ex_04082024.AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(100);
        c.arrest();


//        c.CanIShoot(); //Thief class cannot used since the method is private or protected
    }

}

