package day03;

public class StaticExample {

    static String country = "Isvec";
    double weight = 80.2;

    public StaticExample(){

    }

    public StaticExample(double newWeight){
        weight = newWeight;
        country = "Turkiye";
    }


    public static String getName(){
        return "mehmet can seyhan";
    }

    public int getAge(){
        return 29;
    }
}
