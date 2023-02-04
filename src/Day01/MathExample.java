package Day01;

public class MathExample {

    double fiyat = 2.49;
    int anlikFiyat = 3;
    public void runMath(){
        System.out.println("random " + Math.random());
        System.out.println("min " + Math.min(4,6));
        System.out.println("max " + Math.max(4,6));
        System.out.println("sqrt " + Math.sqrt(4));
        System.out.println("abs " + Math.abs(-4));
        System.out.println("pow " + Math.pow(2,3));
        System.out.println("round " + Math.round(fiyat));
        System.out.println("ceil " + Math.ceil(fiyat));
        System.out.println("floor " + Math.floor(fiyat));
    }

    public void runConditions(){
        if (anlikFiyat == 4){
            System.out.println("anlikFiyat 4 den tur");
        } else if (anlikFiyat == 3){
            System.out.println("anlikFiyat 3 tur");
        } else {
            System.out.println("Anlik fiyat 3 degildir veya 4 degildir v");
        }

        String fiyatDurumu = fiyat < 4 ? "uygun fiyat" : "pahali fiyat";
        System.out.println("fiayDurumu "+ fiyatDurumu);
    }

    public void runSwicth(){
        switch (8){
            case 0:
                System.out.println("bugun pazar");
                break;
            case 1:
                System.out.println("bugun pazartesi");
                break;
            case 2:
                System.out.println("bugun sali");
                break;
            case 3:
                System.out.println("bugun carsamba");
                break;
            case 4:
                System.out.println("bugun persembe");
                break;
            case 5:
                System.out.println("bugun cuma");
                break;
            case 6:
                System.out.println("bugun cumartesi");
                break;
            default:
                System.out.println("Bilinmeyen gun");
        }
    }
}
