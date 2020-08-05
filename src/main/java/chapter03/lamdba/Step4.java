package chapter03.lamdba;

import java.util.Comparator;

public class Step4 implements Comparator<Apple> {

    @Override
    public int compare(Apple a1, Apple a2) {
        return a1.getWeight().compareTo(a2.getWeight());
    }

//    inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
//    inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));

//        inventory.sort(comparing(Apple :: getWeight));

}


