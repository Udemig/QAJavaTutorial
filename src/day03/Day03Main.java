package day03;

public class Day03Main {

    final static double PI = 3.14; // final degistirilemez

    public static void main(String[] args) {
        /*
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        int currentAge = methodOverloadingExample.calcAge(1994);
        System.out.println("currentAge : " + currentAge);
        int diffAge = methodOverloadingExample.calcAge(1994,2023);
        System.out.println("diffAge : " + diffAge);

        RecursionExample recursionExample = new RecursionExample();
        int sumResult = recursionExample.sum(6);
        System.out.println("sumResult: " + sumResult);

        System.out.println("Benim adim: " + StaticExample.getName());
        System.out.println("Benim ulke: " + StaticExample.country);

        StaticExample staticExample = new StaticExample(79.2);
        System.out.println("Benim age: " +  staticExample.getAge());
        System.out.println("Benim weight: " +  staticExample.weight);
        System.out.println("Benim country: " +  StaticExample.country);



        StaticExample staticExample = new StaticExample();



        EncapsulationExample encapsulationExample = new EncapsulationExample();
        encapsulationExample.setAccountAmount(3000);
        System.out.println("Para miktarim: " + encapsulationExample.getAccountAmount());




        CarExample carExample = new CarExample();
        carExample.run();


        VehicleExample vehicleExample = new CarExample();
        vehicleExample.run();

        CarExample carExample1 = (CarExample) vehicleExample;

        Object object = carExample1;


         */

        OuterExample outerExample = new OuterExample();
        System.out.println("x: " + outerExample.x);
        OuterExample.InnerExample innerExample = outerExample.new InnerExample();
        System.out.println("y: " + innerExample.y);
    }

}
