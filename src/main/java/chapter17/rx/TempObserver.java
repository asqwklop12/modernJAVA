package chapter17.rx;

import chapter17.TempInfo;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class TempObserver implements Observer<TempInfo> {
    @Override
    public void onSubscribe(Disposable d) {
    }

    @Override
    public void onError(Throwable e) {
        System.out.println("Got problem:" + e.getMessage());

    }

    @Override
    public void onNext(TempInfo tempInfo) {
        System.out.println(tempInfo);
    }

    @Override
    public void onComplete() {
        System.out.println("Done!");
    }
}
