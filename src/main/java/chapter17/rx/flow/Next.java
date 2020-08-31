package chapter17.rx.flow;

import chapter17.TempInfo;
import chapter17.rx.TempObserver;
import io.reactivex.Observable;

import java.util.Arrays;

import static chapter17.rx.Main.getTemperature;
import static java.util.stream.Collectors.toList;

public class Next {

    public static Observable<TempInfo> getCelsiusTemperature(String town) {
        return getTemperature(town)
                .map(temp -> new TempInfo(temp.getTown(),
                        ((temp.getTemp()) - 32) * 5 / 9));
    }

    public static Observable<TempInfo> getNegativeTemperature(String town) {
        return getCelsiusTemperature(town)
                .filter(tempInfo -> tempInfo.getTemp() < 0);
    }

    public static Observable<TempInfo> getCelsiusTemperatures(String... towns) {
        return Observable.merge(Arrays.stream(towns)
                .map(Next::getCelsiusTemperature)
                .collect(toList()));
    }

    public static void main(String[] args) {
        Observable<TempInfo> observable = getCelsiusTemperatures(
                "New York", "Chicago", "San Francisco"
        );
        observable.blockingSubscribe(new TempObserver());
    }
}
