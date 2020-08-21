package chapter13.pattern2;

public class C implements B, A {
    public static void main(String[] args) {
        new C().hello();
        // Hello B가 나온다.
    }
}
