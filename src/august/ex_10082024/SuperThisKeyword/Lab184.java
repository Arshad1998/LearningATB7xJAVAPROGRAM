package august.ex_10082024.SuperThisKeyword;

public class Lab184 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}

class Student extends Person {
    // is A relation - inheritance
    @Override
    void message() {
        System.out.println("I am Student message");
    }

    void display() {
        super.message();
        this.message();
    }


}

class Person {
    void message() {
        System.out.println("I am person message");
    }
}
