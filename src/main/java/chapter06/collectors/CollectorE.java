package chapter06.collectors;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.stream.Collector.Characteristics;

public interface CollectorE<T, A, R> {
    Supplier<A> supplier(); // 1단계 새로운 결과 컨테이너 만들기

    BiConsumer<A, T> accumulator(); // 2단계 결과 컨테이너 만들기

    Function<A, R> finisher(); // 3단계 최종 변환값을 결과 컨테이너로 적용하기

    BinaryOperator<A> combiner(); // 4 단계

    Set<Characteristics> characteristic();
}
