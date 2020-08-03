 package chapter02.quiz.step4;

import chapter02.Apple;

import java.util.ArrayList;
import java.util.List;

 public class quiz {
     // 플레그를 이용해서 작성해본다.
     public static List<Apple> filterApples(List<Apple> inventory, AppleFormatter formatter) {
         List<Apple> result = new ArrayList<>();
         for (Apple apple : result) {
             String output = formatter.accept(apple);
             System.out.println(output);
         }
         return result;
     }



  }