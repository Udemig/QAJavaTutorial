package day03;

public class VehicleExample {
    protected String brand = "Volvo";
    int bornYear = 2023;
    public void run(){
        System.out.println("Volvo yollarda...");
    }

    private void pullGear(){
        System.out.println("Vites 1 dustu");
    }

    public final void putWindowDown(){
        System.out.println("Camlar iniyor");
    }
}
