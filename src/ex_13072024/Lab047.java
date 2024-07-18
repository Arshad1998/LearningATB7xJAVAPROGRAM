package ex_13072024;

public class Lab047 {
    public static void main(String[] args) {
        // || - OR  // only false || false gives true
        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
    }
}
