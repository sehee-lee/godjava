package ch16;

public class OuterOfStatic {
    static class StaticNested {
        private int value = 0;
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
    class Inner {
        private int value = 10;
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
}
