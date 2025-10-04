package august.ex_04082024.AccessModifiers.Thief;

import august.ex_04082024.AccessModifiers.Police.Cop;

public class Security extends Cop {

    void NeedGun(){
        CanIShoot(); // Can access the protected method from parent class in different Package
    }



}
