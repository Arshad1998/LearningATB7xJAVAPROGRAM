package august.ex_11082024.Abstraction.Interface.CarEx;

public interface Engine {

/*  We will make a class as an Abstract class using Abstract we have a concept interface in JAVA which is  by default
    abstract*/

/*
    Interfaces:
    An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures,
    default methods, static methods, and nested types. Interfaces provide a way to achieve full abstraction (100%)
    since all methods are by default abstract (unless they have default implementations).
*/

    // No need to explicitly give abstract it is by default abstract
    void startEngine();
    void stopEngine();
}
