package august.ex_18082024.Throw;

public class Bank {

    private String currency;
    private int amount;

    public Bank(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public Integer add(Bank bankname) //Here Parameter is object ref for Bank class - In run time based on which ref passed
                                            // from main it'll execute
    {
        if (bankname.currency.equalsIgnoreCase(this.currency)){
            try {
                throw new Exception("Currency doesn't match");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Integer sum = this.amount+bankname.amount;
        return sum;

    }


}
