package chapter13.pattern2;

public class C4 extends D3 implements B, A {
    public static void main(String[] args) {
        new C4().hello();
        // Hello D가 나온다.
    }

    @Override
    public void hello() {

    }
}
