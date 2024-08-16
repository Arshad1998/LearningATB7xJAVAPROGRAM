package august.ex_10082024.Encapsulation.Bank;

public class ICICI {
    private String name;
    private long bal;

    public ICICI(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if (isAdmin) {
            this.name = name;
        }
    }


    public long getBal() {
        return bal;
    }

    public void setBal(long balance ,boolean isAdmin) {
        if (isAdmin)
            this.bal = bal;
        //if the variable name is same must use this operator or best practice to use this always

    }
}
