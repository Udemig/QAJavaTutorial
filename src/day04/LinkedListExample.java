package day04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    LinkedList<Integer> examResults = new LinkedList<>(Arrays.asList(40,50,60,70,10));

    void performOperations(){

        System.out.println("getFirst: " + examResults.getFirst());


    }
}
