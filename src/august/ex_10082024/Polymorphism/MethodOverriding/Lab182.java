package august.ex_10082024.Polymorphism.MethodOverriding;

public class Lab182 {

//    Method Overriding or Run time Polymorphism

    public static void main(String[] args) {

        Hound h1 = new Hound();
        h1.bark();
        h1.jump();

        Dog d1 = new Dog();
        d1.bark();



        Dog dh = new Hound();
        dh.bark();

//     Super class can have reference to subclass's object but subclass can not refer to super class's object
//        Hound hd = new Dog();  This will show error in compile time itself

//     Super class reference pointing to Sub class object can access only overridden methods not others
//        dh.jump(); //This will show error


//      Refer ATB7X notes doc for more understanding

     }
}
