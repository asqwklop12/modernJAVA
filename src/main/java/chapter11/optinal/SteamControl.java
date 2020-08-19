package chapter11.optinal;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class SteamControl {

    public Set<String> getCarInsuranceName(List<Person> persons) {
        return persons.stream()
                .map(Person::getCar)
                .map(optCar -> optCar.flatMap(Car::getInsurance))
                .map(otpIns -> otpIns.map(Insurance::getName))
                .flatMap(Optional::stream)
                .collect(toSet());
    }

}
