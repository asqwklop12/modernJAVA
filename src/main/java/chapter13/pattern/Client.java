package chapter13.pattern;

public class Client {
    public static void main(String[] args) {
        Monster m = new Monster();
        m.rotateBy(180);
        m.moveHorizontally(10);
        System.out.println(m.getX());
    }
}
