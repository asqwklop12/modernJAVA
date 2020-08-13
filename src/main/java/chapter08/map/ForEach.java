package chapter08.map;

import java.util.Map;

public class ForEach {

    public void entry(Map<String, Integer> ageOfFriends) {
        for (Map.Entry<String, Integer> entry : ageOfFriends.entrySet()) {
            String friend = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(friend + "is " + age + " year old");
        }
    }

    // 자바 8
    public void eight(Map<String, Integer> ageOfFriends) {
        ageOfFriends.forEach((friend, age) -> System.out.println(friend + " is " + age + " years old"));
    }
}
