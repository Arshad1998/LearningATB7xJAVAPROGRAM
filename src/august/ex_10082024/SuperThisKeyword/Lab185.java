package august.ex_10082024.SuperThisKeyword;

public class Lab185 {

    // super.variable
    // super.method()
    // super() -> DC
    // super("pramod') -> PC

    // this()
    // this.variableName

    public static void main(String[] args) {

        Student1 s1 = new Student1();
    }

}

class Person1 {
    Person1() {
        System.out.println("Person1 - DC");
    }

    Person1(String a) {
        System.out.println("Person1 - PC A1");
    }

    Person1(String a, int a1) {
        System.out.println("Person1  - PC A2");
    }
}
class Student1 extends Person1{
    int a = 10;
    Student1(String s){
        System.out.println("PC -Student");
    }

    Student1(){
//        super();
//        super("Pramod");
//        super("pramod",12);
        this("mbmb");
        System.out.println(this.a); // We can access variable using this and super multiple times


    }


}