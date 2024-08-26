package august.ex_24082024.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab245 {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();  //<> -> will be used ehen we need specific dtatype
        //As we see from chart in notes, Map is part of collection framework but a separate interface, Hence no add method
        map.put("id",1); //key value
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null); //value as null is allowed multiple times
        map.put("id5",null);
        map.put(null,100);
        map.put(null,101); //But key as null will be allowed only once. if 2 are given latest will bw chosen
//        map.put("id5","pramod");
        System.out.println(map);
        System.out.println(map.size()); //no of key (this also considering only one null key value)
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));
        System.out.println(map.keySet()); //provide all keys as a separate set
        System.out.println(map.values()); //provide all values as a separate set
        System.out.println(map.get("id3"));

        System.out.println(" --------------------------------");

        // How to iterate over all the elements in the map - on;y advanced for loop (for each) is allowed
        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }

}
}
