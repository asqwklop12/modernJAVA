package chapter13.pattern2;

public interface B2 {
    default void hello() {
        System.out.println("Hello from B");
    }
}
