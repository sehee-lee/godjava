package ch25;

public class CommonCalculate {
    private int amount;
    Object lock = new Object();

    public CommonCalculate() {
        amount = 0;
    }
    public void plus(int value) {
        synchronized(lock) {
            amount += value;
        }
    }
    public void minus(int value) {
        synchronized(lock) {
            amount -= value;
        }
    }
    public int getAmount() {
        return amount;
    }
}