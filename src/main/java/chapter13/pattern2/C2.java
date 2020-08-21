package chapter13.pattern2;

public class C2 extends D implements B, A {
    public static void main(String[] args) {
        new C2().hello();
        // Hello B가 나온다.
    }
}
