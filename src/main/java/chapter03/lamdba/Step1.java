package chapter03.lamdba;

import java.util.Comparator;

public class Step1 implements Comparator<Apple> {

    @Override
    public int compare(Apple a1, Apple a2) {
        return a1.getWeight().compareTo(a2.getWeight());
    }

//        inventory.sort(new Step1());

}


