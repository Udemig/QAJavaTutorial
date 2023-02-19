package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    List<String> cars = new ArrayList<>(); //int -> Integer, long -> Long

    void performOparetions() {
        cars.add("Togg12");
        cars.add("Togg22");
        cars.add("Togg332");
        cars.add("volvo"); // ekler
        cars.add("BMW");
        cars.add("Mazda");

        Iterator<String> iteratorCars = cars.iterator();
        while (iteratorCars.hasNext()){
            System.out.println(iteratorCars.next());
        }



    }
}
