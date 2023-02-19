package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaExample {

    ArrayList<Integer> classes = new ArrayList<>(Arrays.asList(20,405,202,24,6));
    void performOperations(){
        /*
        parametre -> ifade
        (parametre1, parametre2) -> ifade
        ifade -> kod blogurud -> { }

         */

        //classes.forEach(n -> System.out.println(n));

        Consumer<Integer> method = n -> System.out.println(n);
        classes.forEach(method);

    }











}
