package inner.istatic;

public class Outer {
    public static class Inner {
    }
    public Inner instantiate() {
        return new Inner();
    }
    public static enum MyEnum {ONE, TWO}
    public static interface MyInterface {}
}