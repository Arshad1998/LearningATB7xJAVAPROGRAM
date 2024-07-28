package ex_27072024;

public class Lab142 {
    public static void main(String[] args) {

        final int a = 10; // here as  we learned we can't change the value of a since it is final
        //a = 90;


        final int[] ages = new int[4];
        ages[3] = 78;
        System.out.println(ages[3]);

/*         final here doesn't make the element of array as final it makes the size of array as final but anyway
            by default size of array is final even though we don't explicitly add it*/

    }
}
