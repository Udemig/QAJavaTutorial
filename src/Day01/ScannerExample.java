package Day01;

import java.util.Scanner;

public class ScannerExample {

    public void getInput(){
        Scanner klavye = new Scanner(System.in);

        System.out.println("ilk sayiyi gir: ");
        int ilkSayi = klavye.nextInt();
        System.out.println("ikinci sayiyi gir: ");
        int ikinciSayi = klavye.nextInt();

        System.out.println("ilkSayi: " +ilkSayi + " ikinciSayi " +ikinciSayi);

        /*
        * Disaridan alinan 2 adet sayidan buyuk olanini bulup
        * ekrana yazdiran ama esitlerse ekrana
        * esittirler yazan bir java console uygulamasi yaziniz.
        * */

        if (ilkSayi == ikinciSayi){
            System.out.println("sayilar esittir");
        } else if (ilkSayi > ikinciSayi){
            System.out.println("ilksayi buyuktur");
        } else {
            System.out.println("ikinci sayi buyuktur");
        }

    }

}
