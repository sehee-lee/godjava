package ch21;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }
    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);

        WildcardGeneric<Integer> wildcardInteger = new WildcardGeneric<Integer>();
        wildcardInteger.setWildcard(10);
        wildcardIntegerMethod(wildcardInteger);

        wildcardMethod(wildcard);
        wildcardMethod(wildcardInteger);
    }
    public void wildcardStringMethod(WildcardGeneric<String> c) {
        String value = c.getWildcard();
        System.out.println(value);
    }
    public void wildcardIntegerMethod(WildcardGeneric<Integer> c) {
        int value = c.getWildcard();
        System.out.println(value);
    }
    public void wildcardMethod(WildcardGeneric<?> c) {
        Object value = c.getWildcard();
        System.out.println(value);
    }
}