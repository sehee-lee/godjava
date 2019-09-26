package ch23;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String args[]) {
        SetSample sample = new SetSample();
        String []cars = new String[] {
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Mustang", "Grandeure",
                "Mini Cooper", "SM5", "Tico"
        };
        System.out.println(sample.getCarKinds(cars));
    }
    public int getCarKinds(String[] cars) {
        if (cars == null)
            return 0;
        Set<String> carSet = new HashSet<String>();
        for (String car:cars) {
            carSet.add(car);
        }

        System.out.println(carSet);
        return carSet.size();
    }
}
