package day04;

public class SiblingsExample implements FatherExample {
    @Override
    public void eat() {
        System.out.println("Kardersler yemek yiyiyor ");
    }

    public void ikizGelisimi(){
        System.out.println(" kardesler orantisiz gelsiiyorlar");
    }
}
