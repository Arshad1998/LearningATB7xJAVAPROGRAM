package august.ex_18082024.Throw;

public class Lab222 {
    public static void main(String[] args) {
        //throw - Custom Exception
        Bank sbi = new Bank(16000, "INR");
        Bank icici = new Bank(1000, "INR");

       Integer sum1 = sbi.add(icici);
       System.out.println(sum1);

       Bank jpMorgan = new Bank(2500, "USD");

//     Here this is wrong bcoz we are adding INR + USD - We can create a Custom Exception for this and then handle it
       Integer sum2 = sbi.add(jpMorgan);
        System.out.println(sum2);



    }
}
