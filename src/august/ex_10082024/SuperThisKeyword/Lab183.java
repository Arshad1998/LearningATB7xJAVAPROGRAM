package august.ex_10082024.SuperThisKeyword;

public class Lab183 {

    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors (Parent/SuperClas Constructors cab be called from SUB class's constructor body using Super Key word)

/*  Super keyword in Java is a reference variable that allows a subclass - child class to refer to its
parent class variable,methods and constructor*/


    // this()
    //1. Use of this with Variables
    //2. Use of this with Methods
    //3. USe of this with constructor


    /*This keyword in Java is a reference variable that allows a  class to call its own variables methods */

/*    call to super must be first statement in constructor & call to this must be first statement in constructor
    hence we cannot have both in the same constructor*/



    public static void main(String[] args) {
        Car s = new Car();



        s.display();


        Car s1 = new Car(45);
    }
}








class Car extends Vehicle //Sub class extending Super class Vehicle
{
    private int maxSpeed = 281;

    Car()//Default Constructor
    {
        //using super keyword with constructor
            // calling the parameterized constructor of Super class using Super keyword
                 //This can be done inside a constructor body only and super keyword should be first statement
        super(10);
        System.out.println("We are still inside Default constructor of Sub class ");

    }

    Car(String name){
        System.out.println("Class Calling it's first parametrized constructor from " + name);
    }

    Car (int e)
    {
        this("Second Parametrized Constructor"); //using this keyword to call it's own constructor
    }

    public void display(){
        // Here the variable name maxSpeed is same in super class and sun=b class hence we can use super and this

        System.out.println("Car speed is -> "+ this.maxSpeed);   //using this keyword accessing variable of subclass
        System.out.println("Vehicle speed is -> "+ super.maxSpeed); //using super keyword accessing variable of super class

        super.message(); //using super accessing superclass method with same name
        this.message(); //using this accessing subclass method with same name

    }

//  Method overriding
    @Override
    void message() {
        System.out.println("Sub class calling method of Super class using super");
    }

}







class Vehicle {   //Super CLass

    public int maxSpeed = 180;

    Vehicle()  //Default Constructor
    {
        System.out.println("DC of super class called implicitly since this constructor in sub class has not explicitly called any constructor in super class");
    }

    Vehicle(int a) //Parameterized Constructor
    {
        System.out.println("Sub class called parameterized constructor of Super class using super");
    }

//   Method Overloading
    void message() //Method
    {
        System.out.println("Sub class calling method of Super class using super");
    }

    void message(int a)
    {
        System.out.println("Hello Vehicle");
    }



}
