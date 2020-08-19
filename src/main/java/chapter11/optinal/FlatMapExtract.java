package chapter11.optinal;

import java.util.Optional;

public class FlatMapExtract {

//    public String getCarInsurance(Person person) {
//        return person.getCar().getInsurance().getName();
//    }

    public Optional<Person> optPerson(Person person) {
        return Optional.of(person);
    }

    public Optional<String> name(Person person) {
        return optPerson(person).flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName);
    }

    public String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("UnKnown");
    }
}
