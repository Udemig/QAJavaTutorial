package day04;

public class FirstWorker extends Thread{
    int value = 0;
    @Override
    public void run() {
        System.out.println("FirstWorker arkada kosuyor");
        for (int i = 0; i < 500000; i++) {
            value = value + i;
        }
        System.out.println("value: " + value);
    }
}
