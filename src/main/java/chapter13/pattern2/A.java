package chapter13.pattern2;

public interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}
