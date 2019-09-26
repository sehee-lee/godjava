package ch21;

import ch21.Car;

public class Bus extends Car {
    public Bus(String _name) {
        super(_name);
    }
    public String toString() {
        return "Bus name is " + name;
    }
}
