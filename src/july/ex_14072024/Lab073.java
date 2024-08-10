package july.ex_14072024;

public class Lab073 {
    public static void main(String[] args) {
        String str1="Hello";

        //1 SCP created
        String str2=" Guys";
        //2 SCP created
        String str3="Hello Guys";
        //3 SCP created
        String str4= str1.concat(str2); // Hello Guys
        // 4 SCP ->concatenation will create another SCP though it looks same as str 3 value
    }
}
