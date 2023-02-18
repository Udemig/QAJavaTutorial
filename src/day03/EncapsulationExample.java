package day03;


public class EncapsulationExample {
    private int accountAmount = 2500;

    public int getAccountAmount() {
        if (accountAmount > 3000){
            return accountAmount;
        } else {
            return 0;
        }
    }

    public void setAccountAmount(int accountAmount) {

        this.accountAmount = accountAmount;
    }
}
