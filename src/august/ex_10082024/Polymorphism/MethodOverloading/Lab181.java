package august.ex_10082024.Polymorphism.MethodOverloading;

public class Lab181 {
    public static void main(String[] args) {
        MathOperations ma = new MathOperations();
        int result_int = ma.add(6 , 7);
        double result_double = ma.add(6.4 , 7.3);
        String result_String = ma.add("Mohamed" , " Arshad");
        String result_Mixed = ma.add("Mohamed", 125);


/*     The selection of method happen at compile time hence it is called compile time polymorphism (Method overloading)
        if you pass wrong set of arguments error identified at compiling and shown immediately

       Method overloading or Compile time polymorphism or Static polymorphism
 */

        System.out.println(result_int);
        System.out.println(result_double);
        System.out.println(result_String);
        System.out.println(result_Mixed);
        ma.add(5,5.9);


    }
}
