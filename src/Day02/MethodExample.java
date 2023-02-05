package Day02;

public class MethodExample {

    public void toplamaYap(){
        int a = 2;
        int b = 3;
        int toplam = a + b;
        System.out.println("toplam: " + toplam);
    }

    public void cikarmaYap(int sayi1, int sayi2){
        int cikar = sayi1 - sayi2;
        System.out.println("cikar: " + cikar);
    }

    public int carpmaYap(int deger1, int deger2){
        int carpma =  deger1*deger2;
        return carpma;
    }
    /*
    * Kisinin yasi console dan alindaktan sonra eger bu kisi 18 ve ustu oy kullanma hakkinin oldugunu
    * degilse oy kullanamayacagini soyleyen bir method yaziniz
    * */
    public String oyHakki(int yas){
        if (yas>=18){
            return "oy kullanabilirsinz";
        } else {
            return "oy kullanamazsin";
        }
    }
}
