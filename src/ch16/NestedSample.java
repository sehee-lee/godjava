package ch16;

public class NestedSample {
    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();

        NestedSample inner_sample = new NestedSample();
        inner_sample.makeInnerObject();
    }
    public void makeStaticNestedObject() {
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(10);
        System.out.println(staticNested.getValue());
    }
    public void makeInnerObject() {
        OuterOfStatic outer = new OuterOfStatic();
        OuterOfStatic.Inner inner = outer.new Inner();
        inner.setValue(100);
        System.out.println(inner.getValue());
    }
}
