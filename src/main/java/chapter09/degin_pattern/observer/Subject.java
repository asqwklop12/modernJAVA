package chapter09.degin_pattern.observer;

public interface Subject {
    void registerObserver(Observer o);

    void notifyObserver(String tweet);
}
