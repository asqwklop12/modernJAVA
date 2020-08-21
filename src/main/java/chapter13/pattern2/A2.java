package chapter13.pattern2;

public interface A2 {
    default void hello() {
        System.out.println("Hello from A");
    }
}
