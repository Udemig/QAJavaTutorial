package day05;

public class Examples {

    /* Elinizde bulunan bir metni tersizne cevivern bir method yazini
    * Ornek: mehmet -> temhem olacaktir
    *  */

    void reverseString(){
        String greeting = "Selamlar ben mehmet can";
        String reversedGreeting = "";
        for (int i = 0; i < greeting.length(); i++) {
            reversedGreeting = greeting.charAt(i) + reversedGreeting;
        }

        System.out.println(reversedGreeting);
    }

    /*
    * Bir Sinifta ogrenciler bulunmaktadir ver her ogrenci belli sayida ders almaktadir.
    * Ogrencilerin ayni sinavdan girip aldiklarini ders ortalamasina bakarak, ogrencinin
    * dersi gecip gecmedigini soyleyen ve eger gecmis ise hangi harf ile gectigini bulan
    * bir program yaziniz
    * Sinfi ortalamasinin altinda kalan sinifta kalir
    *
    * Ilk sinavin %40
    * ikinci sinavinin %60 ini alinir
    *
    * ve ortalama 50 nin altinda kalan tum ogrenciler icin kaldi olur
    * 50 ustu olanlar icin en yuksek not baz alinarak harfler verilir
    * 50 ve en yuksek nok arasi 7 e bolunecektir
    * ilk kisim DD
    * ikinci kisim DC
    * ucuncu kisim CC
    * dorduncu kisim BC
    * besindi kisim BB
    * altinci kisim BA
    * yedinci kisim AA olacaktir
    * */
}
