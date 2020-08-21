package chapter13.pattern2;

public class C5 implements B2, A2 {
    public static void main(String[] args) {
        new C5().hello();
        // Hello D가 나온다.
    }

    @Override
    public void hello() {
        B2.super.hello();
    }
}
