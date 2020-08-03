 package chapter02.step5;

import chapter02.Apple;

import java.util.ArrayList;
import java.util.List;

 public class Step5 {
     // 플레그를 이용해서 작성해본다.
     public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
         List<Apple> result = new ArrayList<>();
         for (Apple apple : result) {
             if (p.test(apple)) {
                 result.add(apple);
             }
         }
         return result;
     }

     // 프린트 익명클래스 -> 람다식으로




  }