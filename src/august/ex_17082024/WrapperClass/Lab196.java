package august.ex_17082024.WrapperClass;

public class Lab196 {
    public static void main(String[] args) {

//     String to Integer conversion

        String num = "10";
        //int a = (int)num; //This conversion is not possible with primitive dat types


        // String to Primitive data type using Wrapper classes

        //Type - 1 String to Integer and Integer to int
        Integer a = Integer.valueOf(num);//But this conversion is possible with Wrapper class
        int b = Integer.valueOf(num);
        System.out.println(a);
        System.out.println(b);

        //Type - 1 String to int directly but implicitly String to Integer and Integer to int
        int a2 = Integer.parseInt(num);
        System.out.println(a2);


    }
}
