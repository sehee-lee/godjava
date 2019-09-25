package ch3;

public class CarManager {
    public static void main(String[] args) {
        Car dogCar = new Car("Black");
        Car catCar = new Car("Red");

        dogCar.speedUp();
        catCar.breakDown();

        System.out.println("current speed of dogCar is " + dogCar.getCurrentSpeed());
    }
}
