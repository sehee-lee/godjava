package ch21;

public class CarWildcardSample {
    public static void main(String args[]) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
    }
    public void callBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildcard(new Car("Mustang"));
        boundedWildcardMethod(wildcard);

        WildcardGeneric<Bus> wildcardBus = new WildcardGeneric<Bus>();
        wildcardBus.setWildcard(new Bus("Volvo"));
        boundedWildcardMethod(wildcardBus);
    }
    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }
}