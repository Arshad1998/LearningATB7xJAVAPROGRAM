package july.ex_27072024;

public class Lab141 {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[3] = 90;
        System.out.println(a[2]); // no value assigned so default value
        System.out.println(a[3]); // assigned value
        System.out.println(a[0]); // no value assigned so default value

    }
}
