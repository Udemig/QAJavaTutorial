package day03;

public final class MethodOverloadingExample {

    public int calcAge(int bornYear){
        return 2023 - bornYear;
    }

    public int calcAge(int bornYear, int currentYear){
        return currentYear - bornYear;
    }

    public int calcAge(int bornYear, int currentYear, int anotherPossibleYear){
        return currentYear - bornYear + anotherPossibleYear;
    }


}
