package day04;

import java.util.HashMap;

public class HashMapExample {

    HashMap<String, String> capitals = new HashMap<>();

    void performOperations(){
        capitals.put("turkey","ankara");
        capitals.put("norway","oslo");
        capitals.put("sweden","stockholm");
        capitals.put("america","washington");
        capitals.put("england","london");
        capitals.put("norway1","oslo");

        capitals.remove("england");
        System.out.println("capitals: "+ capitals);
        System.out.println("capitals turkey: "+ capitals.get("turkey"));
        System.out.println("sweden: "+  capitals.containsKey("sweden"));
        System.out.println("london: "+  capitals.containsValue("london"));

        for (String item: capitals.keySet()) {
            System.out.println(item);
        }

        for (String item: capitals.values()) {
            System.out.println(item);
        }

        System.out.println(capitals);


    }
}
