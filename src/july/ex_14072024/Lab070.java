package july.ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Mohamed");
        String s2 = new String("Mohamed");
        //  Here using new operator we created 2 reference with same value  2 Heap area will be  created with same value
        String s3  = s1;
        //  still 2 heap area only will  be there but we declared  s3 which will just point -> s1 -> Mohamed
    }
}
