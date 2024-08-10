package july.ex_13072024;

public class Lab020 {
    public static void main(String[] args) {
        byte b = 127;
        //b = b+1;
        System.out.println(b);

        char grade = 'A';
        char grade_arshad = 'E';
        char grade_farhana = 'B';
        char c = '!';
        char c2 = '@';
        char _123 = 'N';

        System.out.println(c);
        System.out.println(c2);
        System.out.println(_123);

//        grade += 'A';
//        System.out.println(grade);
//        char+char is not a String directly either it can stored as int or a diff unicode char

        int grade_new = grade + 'A';
        System.out.println(grade_new);


        int age = 123;
        // Can I change the data type of variable between program - No
        //Cannot be changed to String or any other data type without using Type Casting
        //String age = "Pramod";      short age = 123; this is mostly like usimg the same variable already declared

        System.out.println(age);

    }
}
