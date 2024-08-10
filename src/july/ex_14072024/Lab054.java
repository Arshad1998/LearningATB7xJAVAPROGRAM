package july.ex_14072024;

public class Lab054 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
//      byte c = a+b; //byte + byte is int hence this line is wrong
        int c = a+b;
        System.out.println(c);

//      float is bigger than double(check the table)

//      char+char = int that's why char is part of integral datatype (check notes)
        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1; // AB ->char
        System.out.println(c1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 69);  //false bcoz b=66
    }
}
