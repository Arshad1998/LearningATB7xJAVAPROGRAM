package august.ex_24082024;

public class Lab249 {
    public static void main(String[] args) {

        temp("Pramod");
        temp(123);
        temp(true);

        sum(3,4);
        sum("pramod","dutta");

        // T - Ref to the Data Type that you want to use.

    }

    public static <T1, T2> T sum(T1 a, T2 b){
        System.out.println(a);
        System.out.println(b);
        return a+b;
    }

    public static <Dutta> void temp(Dutta name) {
        System.out.println(name);
    }
}
