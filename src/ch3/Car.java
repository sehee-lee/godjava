package ch3;

public class Car {
    int speed;
    int distance;
    String color;

    public Car(String _color) {
        speed = 0;
        distance = 0;
        color = _color;
        System.out.println("new car!! " + "color is : " + color);
    }
    public void speedUp() {
        System.out.println("speed up!!");
        speed += 5;
        System.out.println("current speed id : " + speed);
    }
    public void breakDown() {
        System.out.println("speed down!!");
        if (speed > 0)
            speed -= 10;
        System.out.println("current speed id : " + speed);
    }
    public int getCurrentSpeed() {
        return speed;
    }
}
