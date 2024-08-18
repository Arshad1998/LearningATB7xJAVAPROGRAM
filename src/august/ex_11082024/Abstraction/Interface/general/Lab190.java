package august.ex_11082024.Abstraction.Interface.general;

public class Lab190 {
}


interface I{} //Empty Interface class

class A{} // concrete class
class B{} // concrete class

abstract class C{} //Non Concrete class


class Test1 extends  A{} // single inheritance
class Test2 extends B{} // single inheritance


// class Test3 extends A,B{} // Multiple Inheritance - not ok with class

class Test0 implements I{} // class implements interface

interface I1{ }
interface I2{}

class Test4 implements I1,I2{} // multiple Inheritance with interface

class Test5 extends A implements I1,I2{}  //This is one more possible way with interface


//class Test6 implements I1 extends A{}// Not Ok  extends should be done first


//interface I3 extends A{}  //interface cannot extend a concrete class too

//interface I4 implements A{}  //interface cannot implement a concrete class too

//interface I5 extends A,B{} //interface cannot extend multiple concrete class too

interface I7  extends I1{} //interface can extend a2 interface
interface I6 extends I1,I2{}  //interface can extend a2 interface

//interface I7  extends C{}
