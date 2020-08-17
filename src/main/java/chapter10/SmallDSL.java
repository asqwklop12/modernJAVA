package chapter10;

import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparing;

public class SmallDSL {

    public void sort(List<Person> person) {
//        Collections.sort(person, new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.getAge() - p2.getAge();
//            }
//        });

        Collections.sort(person, (p1, p2) -> p1.getAge() - p2.getAge());

        Collections.sort(person, comparing(p -> p.getAge()));

        Collections.sort(person, comparing(Person::getAge));
    }

    public void revers(List<Person> person) {
        Collections.sort(person, comparing(Person::getAge).reversed());
    }

    public void getName(List<Person> person) {
        Collections.sort(person,
                comparing(Person::getAge).thenComparing(Person::getName));

        person.sort(comparing(Person::getAge).thenComparing(Person::getName));
    }
}
