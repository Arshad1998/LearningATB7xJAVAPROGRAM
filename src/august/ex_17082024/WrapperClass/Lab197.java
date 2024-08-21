package august.ex_17082024.WrapperClass;

public class Lab197 {
    public static void main(String[] args) {

//    The below object reference creation was available until Java9, But it is now removed we can directly initialize as usual
//        Integer i = new Integer(67);


        Double d1 = 3.14; //Heap area
        double d2 = 3.14; //continuous memory

        System.out.println(d1);
        System.out.println(d2);

/*      Value wise both d1 and d2 are same but d1 will be stored in Heap are since it is an object whereas
           d2 will be stored in continuous memory*/

//      Since Java likes objects  Wrapper classes are preferred
    }
}
