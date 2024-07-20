package ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM doesn't allow it
        //if needed we can do explicit (But data will be lost)

        //long int value will be converted to Binary and 16 bits will be taken from it bcoz of short which will be
        //then converted to Decimal
        short s = (short) phone_no;
        System.out.println(s);
        // JVM - overflowing data(lost data) will go to Garbage Collector
    }
}
