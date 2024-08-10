package july.ex_14072024;

public class Lab069 {
    public static void main(String[] args) {
        String s1 = "Mohamed";
        // 1  SCP created
        s1 = "Shafeeq";
        // 2  SCP created
        s1 = "Farhana";
        // 3  SCP created
        s1 = "Mohamed";
        // still 3, SCP

//        String is immutable S1=Mohamed (Mohamed will be stored in String Constant pool and s1 will point to it)
//        But when we do S1=Shafeeq (Mohamed will still be there in SCP but s1 will point Shafeeq)
//        When we again do S1=Mohamed then no new Mohamed value willbe sured already stored value will restored
    }
}
