package ch21;

public class Car {
    protected String name;

    public Car(String _name) {
        this.name = _name;
    }
    public String toString() {
        return "Car name is " + name;
    }
}
