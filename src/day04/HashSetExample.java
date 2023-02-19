package day04;

import java.util.HashSet;

public class HashSetExample {
    HashSet<String> names = new HashSet<>();
    void performOperations(){
        names.add("can");
        names.add("Ali");
        names.add("ayse");
        names.add("mehmet");
        names.add("ahmet");
        names.add("ali");

        System.out.println(names);

        for (String name: names) {
            System.out.println(name);
        }


    }
}
