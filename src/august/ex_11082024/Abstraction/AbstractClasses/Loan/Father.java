package august.ex_11082024.Abstraction.AbstractClasses.Loan;

abstract class Father {
    abstract void loan50K();

    void loan25k() {
        System.out.println("25k is already paid by Father");
    }
}
