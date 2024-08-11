package august.ex_04082024.AccessModifiers.Police;

public class Cop {

    private int gun;
    private String id;

    public Cop() {
    }

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void CanIShoot(){
        System.out.println("Yes! You can shoot");
    }

    public void arrest(){
        System.out.println("Arrest thief");
    }

}
