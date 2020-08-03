 package chapter02;

import java.util.ArrayList;
import java.util.List;

 public class Step2 {
     // 색깔을 파라미터화 시키고 무게를 추가할 경우
     public static List<Apple> filterGreenApples(List<Apple> inventory, String color) {
         List<Apple> result = new ArrayList<>();
         for (Apple apple : result) {
             if (Color.GREEN.equals(color)) {
                 result.add(apple);
             }
         }
         return result;
     }

     public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
         List<Apple> result = new ArrayList<>();
         for (Apple apple : result) {
             if (weight < apple.getWeight()) {
                 result.add(apple);
             }
         }
         return result;
     }

     //DRY DRY DRY 같은걸걸
  }