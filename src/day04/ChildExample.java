package day04;

public class ChildExample implements FatherExample, MotherExample{
    @Override
    public void eat() {
        System.out.println("Cocuk yemek yiyior " );
    }

    @Override
    public void sleep() {
        System.out.println("cocuk uyuyor");
    }
}
