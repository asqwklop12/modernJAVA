package chapter17;

import org.reactivestreams.Processor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class TempProcessor implements Processor<TempInfo, TempInfo> {

    private Subscriber<? super TempInfo> subscriber;

    @Override
    public void subscribe(Subscriber<? super TempInfo> s) {
        this.subscriber = s;
    }

    @Override
    public void onNext(TempInfo tempInfo) {
        subscriber.onNext(new TempInfo(tempInfo.getTown(),
                (tempInfo.getTemp() - 32) * 5 / 9));
    }

    @Override
    public void onSubscribe(Subscription s) {
        subscriber.onSubscribe(s);
    }

    @Override
    public void onError(Throwable t) {
        subscriber.onError(t);
    }

    @Override
    public void onComplete() {
        subscriber.onComplete();
    }
}
