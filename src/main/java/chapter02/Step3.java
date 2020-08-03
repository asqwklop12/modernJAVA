 package chapter02;

import java.util.ArrayList;
import java.util.List;

 public class Step3 {
     // 플레그를 이용해서 작성해본다.
     public static List<Apple> filterApples(List<Apple> inventory, String color, int weight , boolean flag) {
         List<Apple> result = new ArrayList<>();
         for (Apple apple : result) {
             if (flag && (Color.GREEN.equals(color) || !flag && (apple.getWeight() < weight))) {
                 result.add(apple);
             }
         }
         return result;
     }

  }