package day03;

public class CarExample extends VehicleExample{

    public void showBrand(){
        System.out.println("Markamiz: " + brand);
    }

    public void showYear(){
        System.out.println("Yasi: " + bornYear);
    }

    @Override
    public void run() {
        putWindowDown();
        System.out.println("Volvo goklerde");
    }

}
