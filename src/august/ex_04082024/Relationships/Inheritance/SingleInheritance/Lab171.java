package august.ex_04082024.Relationships.Inheritance.SingleInheritance;

public class Lab171 {

    public static void main(String[] args) {
        Son s = new Son();
        s.BHK2();
        s.BHK3(); // Here now class son is not able to access the method in Father

//       Single Inheritance - Class Son by using extends keyword with class Father son can use the methods in Father
//       Since Son extends Father while the Son clas is loaded in Class Loader Father class will also be loaded
//       s.BHK3();


        Father f = new Father();
        f.BHK3();
//        f.BHK2();  This fails bcoz Class Father still cannot use the methods in Class Son

/*        But we cannot add extend to Father as well bcoz JAVA doesn't allow cyclic inheritance
         Either Son can extend Father or Father can extend Son but both are not possible*/

//    Extends -> IS - A - Relationship

//        better example - Son can use Father's Surname but Father cannot Son's Surname

//    Single inheritance is used 90%
//    Multiple inheritance is used 10%





    }

}
