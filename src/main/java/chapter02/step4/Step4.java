 package chapter02.step4;

import chapter02.Apple;
import chapter02.Color;

import java.util.ArrayList;
import java.util.List;

 public class Step4 {
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



  }