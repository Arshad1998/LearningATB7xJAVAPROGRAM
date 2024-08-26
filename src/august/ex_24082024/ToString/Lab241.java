package august.ex_24082024.ToString;

public class Lab241 {
    public static void main(String[] args) {

        Person p1 = new Person("Arshad", "Chennai");
        Person p2 = new Person("Suraj", "West bengal");
        Person p3 = new Person("Rasagna", "Hyderabad");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        //When we print an object - By default tostring method from Object is called and clasname@hexavallue output will be printed
        //to modify this we can override this tostring method and change it as per our need



    }
}

class Person{

    private String name;
    private String location;

    public Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
//        return super.toString(); //this is the default output now we are changing this

        return '{' + "Name -> " + name + " , Location -> " + location + '}';

    }
}
