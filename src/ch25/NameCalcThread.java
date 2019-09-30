package ch25;

public class NameCalcThread extends Thread {
    private int calcNumber;
    public NameCalcThread(String name, int _calcNumber) {
        super(name);
        this.calcNumber = _calcNumber;
    }
    public void run() {
        calcNumber++;
    }
}
