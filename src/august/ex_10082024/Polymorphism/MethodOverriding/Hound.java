package august.ex_10082024.Polymorphism.MethodOverriding;

public class Hound extends Dog {

@Override
    void bark()
    {
        System.out.println("I'm Hound and I'm barking");
    }

    void jump ()
    {
        System.out.println("Hound is jumping very high");
    }
}
