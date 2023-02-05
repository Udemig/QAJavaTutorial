package Day02;

import java.util.Scanner;

public class ArrayExample {

    String[] cars = {"volvo","bmw", "togg","mercedes","renault"};
    int[][] sayilar = {
            {1,5,2,7,8},
            {10,34,64,13,76},
            {10,34,-64,13,-76},
            {1,5,2,7,8},
            {1,5,2,7,-8}
    };
    Scanner scanner = new Scanner(System.in);
    String TAS = "tas", MAKAS = "makas", KAGIT = "kagit";



    public void runArrays(){

        /* System.out.println("length: " + cars.length);
        System.out.println("0 eleman: " + cars[0]);
        System.out.println("toString: " + cars.toString());

        for (int i = 0; i < cars.length; i++){
            System.out.println(" i " + i + " " + cars[i]);
        }


        for (String eleman:cars) {
            System.out.println(eleman);
        }

         */

        System.out.println("kiki boyutlu eleman: " + sayilar[1][2]);
        System.out.println(" boyutlu : " + sayilar.length);

        for (int i=0; i<sayilar.length; i++){
            for (int j=0; j<sayilar[i].length; j++){
                System.out.println("i: " + i + " j: " + j + " eleman: " + sayilar[i][j]);
            }
        }

    }

    public void getInfo(){
        System.out.println("ad gir: ");
        String ad = scanner.next();
        System.out.println("yas gir");
        int yas = scanner.nextInt();
        System.out.println("adin: " + ad + " yas: " + yas);
    }

    public void estimateNumber(){
        double mSayiDouble = Math.random()* 100; //0.436893849639 * 100  -> 43.0
        int mSayi = (int) mSayiDouble;
        int hak = 1;
        System.out.println("Makina uretti: " + mSayi);
        while (hak < 4){
            System.out.println("Lutfen bir sayi giriniz");
            int oSayi = scanner.nextInt();
            if (oSayi == mSayi){
                System.out.println("Kazandinizzz");
                break;
            } else {
                if (hak == 3){
                    System.out.println("Kaybetinizzz");
                } else {
                    if (oSayi>mSayi){
                        System.out.println("Kucuk olmali");
                    } else{
                        System.out.println("buyuk olmaliii");
                    }
                    hak++;
                }
            }
        }
    }

    public void runGame(){
        System.out.println("oyun basladiii");
        System.out.println("1. oyuncu: ");
        String oyuncu1 = scanner.next();
        System.out.println("2. oyuncu: ");
        String oyuncu2 = scanner.next();

        if (oyuncu1.equals(oyuncu2)){
            runGame();
        }else {
            if ((oyuncu1.equals(TAS) && oyuncu2.equals(MAKAS))
                    || (oyuncu1.equals(KAGIT) && oyuncu2.equals(TAS))
                    || (oyuncu1.equals(MAKAS) && oyuncu2.equals(KAGIT)) ){
                System.out.println("oyuncu 1 kazandi");
            } else {
                System.out.println("oyuncu 2 kazandi");
            }
        }
    }

}
