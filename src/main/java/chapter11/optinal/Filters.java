package chapter11.optinal;

import java.util.Optional;

public class Filters {

    public void insuranceFilter(Insurance insurance) {
        if (insurance != null && "CambridgeInsurance".equals(insurance.getName())) {
            System.out.println("Ok");
        }
    }

    public void insuranceFilter(Optional<Insurance> optInsurance) {
        optInsurance.filter(insurance -> "CambridgeInsurance".equals(insurance.getName()))
                .ifPresent(x -> System.out.println("Ok"));
    }

    public String getCarInsuranceName(Optional<Person> person, int minAge) {
        return person.filter(p -> p.getAge() >= minAge)
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("UnKnown");
    }
}
