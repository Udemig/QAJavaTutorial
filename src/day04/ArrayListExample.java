package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    List<String> cars = new ArrayList<>(); //int -> Integer, long -> Long
    List<String> cars1 = new ArrayList<>(); //int -> Integer, long -> Long

    List<String> cars2 = new ArrayList<>(Arrays.asList("BMX","Volvo")); //int -> Integer, long -> Long

    void doOparetions(){
        cars1.add("Togg12");
        cars1.add("Togg22");
        cars1.add("Togg332");
        cars.addAll(cars1);
        cars.add("volvo"); // ekler
        cars.add("BMW");
        cars.add("Mazda");
        cars.set(0, "porche"); // degistir
        cars.remove(0); // kaldir
        System.out.println(cars);
        System.out.println("index 0: " + cars.get(0)); // index e gore al
        System.out.println("contains BMW: " +   cars.contains("BMW")); // iceriyor mu?
        System.out.println("size: " +   cars.size()); // iceriyor mu?

        cars.add("volvo");
        cars.add("SASS");
        cars.add("SCANIA");
        cars.add("FERRARI");
        cars.add("MITSUBICHE");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("i: "+ i + " " + cars.get(i));//al
        }

        for (String item: cars) {
            System.out.println(item);
        }

        System.out.println("sirasi: " + cars);
        Collections.sort(cars);//sirala
        System.out.println("sirali: " + cars);
        System.out.println("indexof: " + cars.indexOf("BMW"));//Sirasi
        System.out.println("isEmpty: " + cars.isEmpty());
        System.out.println("removeAll: " + cars.removeAll(cars1));
        cars.clear(); // temizle

        String[] constantArray = (String[]) cars.toArray();

        System.out.println("sirasi: " + cars);



    }





}
