package july.ex_27072024;

public class Lab152 {

    public static void main(String[] args) {
/*    Since String is immutable in nature we won't use string much in Automation. we have two more string classes which we
    will use*/
//    String Builder StringBuffer

/*    StringBuilder and StringBuffer in Java

    StringBuilder and StringBuffer are classes that provide mutable sequences of characters.
    They are designed for efficient string manipulation operations, such as appending, inserting, or deleting characters from a string.
*/

        String s1 = "PRAMOD";
        s1 = "Dutta";
        //Here though we changed the value of string s1 SCP will have 2 string it won't delete Pramod

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta

        // Here Stringbuffer replaces the value of stringBuffer from Pramod to dutta and dutta to JI

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");

   /* The main difference between StringBuilder and StringBuffer is that StringBuilder is not thread-safe, while StringBuffer is thread-safe.
    StringBuilder is faster and more efficient in single-threaded environments, while StringBuffer is safer to use in multi-threaded environments.
*/
        // Thread Safety?
        // stringBuilder - not thread safe - bit since it is fast people love it and mostly used in automation




    }




}
