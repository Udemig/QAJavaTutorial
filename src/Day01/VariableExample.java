package Day01;

public class VariableExample {
    //Primitive - Ilkel
    public boolean evliMi= false; // 1 bit

    public byte elektrikVurus = 0;
    public short boyu = 12431;
    public char basHarfi = 'M'; // 2 byte
    public int yas = 20463436;
    public long maasi = 234253523;
    public float fiyat2 = 234.5423543534f;
    public double fiyat1 = 23424643646474474.135235;

    //String - Non Primitive
    public String adim = "Mehmet can";

    String okulNumaram = "234";

    public void wideningTypeCasting(){
        long yeniYas = yas;
        int yeniBoy = boyu;

        if (fiyat1 > fiyat2 && 4>3){
            System.out.println("wideningTypeCasting calisti ve");
        }
    }

    public void narrowingTypeCasting(){
        int yeniMaas = (int) maasi;
        short yeniFiyar = (short) maasi;
        if (fiyat2 > fiyat1 || 4>3){
            System.out.println("narrowingTypeCasting calisti veya");
        }
    }

    public void toStringTypeCasting(){
        String benVeYas = "mehmet can " + yas;
        String benVeMaasim = String.valueOf(maasi) ;
    }

    public  void fromStringTypeCasting(){
        int okulNumarasi = Integer.valueOf(okulNumaram);
        double ondalikliNumaram = Double.valueOf(okulNumaram);
    }
}
