package chapter18;

import chapter03.lamdba.Apple;

import java.util.Iterator;
import java.util.List;

public class IteratorE {

    public void it(List<Apple> apples) {
        Iterator<Apple> it = apples.iterator();

        while (it.hasNext()) {
            Apple apple = it.next();
            System.out.println(apple.getColor() + " " + apple.getWeight());
        }
    }

//    public void searchForGold(List<String> l , Starts starts) {
//        for (String s : l) {
//            if ("gold".equals(s)) {
//                starts.incrementFor("gold");
//            }
//        }
//    }
}
