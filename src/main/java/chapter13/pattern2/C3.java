package chapter13.pattern2;

public class C3 extends D2 implements B, A {
    public static void main(String[] args) {
        new C3().hello();
        // Hello D가 나온다.
    }
}
