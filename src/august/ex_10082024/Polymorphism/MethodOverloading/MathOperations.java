package august.ex_10082024.Polymorphism.MethodOverloading;

public class MathOperations {

    int add(int a , int b)
    {
        return a+b;
    }


    double add(double h , double i)
    {
        return h+i;
    }

    String add(String a , String b)
    {
        return a+b;
    }

    String add(String a , int b)
    {
        return a+b;
    }

    int sdd (int a, int b, int c , int d)
    {
        return a+b+b+c+d;
    }

//   same method name with Different return type will also come under overloading

    void add (int a, double b)
    {
        double result = a+b;
        System.out.println("diff Return type of fuc with same name also comes under method overloading " + result);
    }

/*   Polymorphism
        Here we have created multiple methods/functions with same name add but based on the
       arguments passed the respective methods are selected. This polymorphism and these selection
       happen at compile time hence it is called compile time polymorphism (Method overloading)

       */

    /*We can use other concepts like constructors, Encapsulation etc along with Method overloading */

}
