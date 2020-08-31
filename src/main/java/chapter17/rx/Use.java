package chapter17.rx;

// rxJava2 import 했음

import chapter17.TempInfo;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Use {
    public static void main(String[] args) {
        new Use().print2();
    }

    public Observable<String> strings() {
        return Observable.just("first", "second");
    }

    public Observable<Long> onPerSec() {
        return Observable.interval(1, TimeUnit.SECONDS);
    }

    public void print() {
        onPerSec().subscribe(i -> System.out.println(TempInfo.fetch("New York")));
    }

    public void print2() {
        onPerSec().blockingSubscribe(i -> System.out.println(TempInfo.fetch("New York")));
    }
}
