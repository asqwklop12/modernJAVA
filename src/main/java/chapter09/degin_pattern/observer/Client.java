package chapter09.degin_pattern.observer;

public class Client {
    public static void main(String[] args) {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());

        f.notifyObserver("The queen said her favorite book is Modern Java in Action!");
    }
}
