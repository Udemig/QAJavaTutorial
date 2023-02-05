package Day02;

import java.util.Scanner;

public class Day02Main {

    public static void main(String[] args) {
        /* ArrayExample arrayExample = new ArrayExample();
        arrayExample.runArrays();
        //arrayExample.getInfo();
        //arrayExample.estimateNumber();
        //arrayExample.runGame();



        MethodExample methodExample = new MethodExample();
        methodExample.toplamaYap();
        methodExample.cikarmaYap(5,3);
        int cikarmaSonuc = methodExample.carpmaYap(3,4);
        System.out.println("cikarmaSonuc " + cikarmaSonuc);


         */

        MethodExample methodExample1 = new MethodExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasini gir: ");
        int yas = scanner.nextInt();
        String oyDurumu = methodExample1.oyHakki(yas);
        System.out.println(oyDurumu);
    }
}