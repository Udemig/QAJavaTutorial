package day04;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClasesExample {

    ArrayList<Integer> ages = new ArrayList<>(Arrays.asList(20,30,40,50));
    void performOperations(){
        int firstAge = ages.get(0).intValue();
        double secondAge = ages.get(1).doubleValue(); // Double -> double
    }
}
