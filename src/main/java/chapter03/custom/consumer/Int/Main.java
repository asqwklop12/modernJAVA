package chapter03.custom.consumer.Int;

public class Main {

    public static void main(String[] args) {
        IntPredicate evenNumbers = (i -> i % 2 == 0);
        System.out.println(evenNumbers.test(1000));

//        IntPredicate oddNumbers = ((Integer i) -> i % 2 != 0); 에러
//        System.out.println(oddNumbers.test(1000));
    }
}
