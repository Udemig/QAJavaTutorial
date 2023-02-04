package Day01;

public class OperatorsExample {
    int ilkSayi = 2; // 3 2
    int ikinciSayi = 4;

    public void cikar(){
        ilkSayi++; // ilkSayi = ilkSayi + 1;
        ilkSayi+=3; // ilkSayi = ilkSayi + 3;
        int sonuc = ikinciSayi - ilkSayi;
        System.out.println("Cikar sonuc: " + sonuc);
        System.out.println("ilkSayi: "+ ilkSayi +" ikinciSayi: " + ikinciSayi + " esit mi? " + (ilkSayi == ikinciSayi));

    }
    public void carp(){
        ilkSayi--; // ilkSayi = ilkSayi - 1;
        ilkSayi-=2;
        int sonuc = ikinciSayi * ilkSayi;
        System.out.println("carp sonuc: " + sonuc);
        System.out.println("ilkSayi: "+ ilkSayi +" ikinciSayi: " + ikinciSayi + " buyuk veya esit mi? " + (ilkSayi >= ikinciSayi));

    }
    public void topla(){
        ilkSayi*=4;
        int sonuc = ikinciSayi + ilkSayi;
        System.out.println("topla sonuc: " + sonuc);
        System.out.println("ilkSayi: "+ ilkSayi +" ikinciSayi: " + ikinciSayi + " kucuk mu? " + (ilkSayi < ikinciSayi));

    }
    public void bol(){
        ilkSayi/=2;
        int sonuc = ikinciSayi / ilkSayi;
        System.out.println("bol sonuc: " + sonuc);
        System.out.println("ilkSayi: "+ ilkSayi +" ikinciSayi: " + ikinciSayi + " kucuk veya esit mi? " + (ilkSayi <= ikinciSayi));

    }

    public void mod(){
        int mod = ikinciSayi % ilkSayi; //  0
        ilkSayi%=3;
        System.out.println("bol sonuc: " + mod);
        System.out.println("ilkSayi: "+ ilkSayi +" ikinciSayi: " + ikinciSayi + " sayilar esit degil? " + (ilkSayi != ikinciSayi));

    }


}
