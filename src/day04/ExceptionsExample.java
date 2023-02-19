package day04;

public class ExceptionsExample {

    int[] numbers = {1,3,5,6,0};

    void performOperations(){
        try {
            System.out.println(numbers[10]);
        } catch (Exception e){
            System.out.println("Exception calistir " + e.getLocalizedMessage());
        }finally {
            System.out.println("finnaly calistir");
        }

        System.out.println(" devam ediyor ");
    }
}
