package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP

        String name2 = new String("The Testing Academy"); // Heap area (OA)
        String name3 = new String("The Testing Academy"); // Heap area (OA)

//      Comparing 2 similar values in SCP
        System.out.println(name == name1); // Check for the Ref
        System.out.println(name.equals(name1)); // Check for the Content

//      Comparing 2 similar values one in SCP and another in Heap
        System.out.println(name1 == name2); // Check for the Ref
        System.out.println(name1.equals(name2)); // Check for the Content

//      Comparing 2 similar values in Heap are
        System.out.println(name2 == name3); // Check for the Ref
        System.out.println(name2.equals(name3)); // Check for the Content





    }
}
