package ex_21072024;

public class Lab132 {
    public static void main(String[] args) {

//       Diff between while and do while
        int i = 10;
        while (i<10){
            System.out.println(i);
            i++;
        }

        int a=10;
        do{
            System.out.println(a);
            a++;
        }while(i<10);

//     Since condition is checked after execution of the body do while at least executes one time unlike other loops

    }
}
