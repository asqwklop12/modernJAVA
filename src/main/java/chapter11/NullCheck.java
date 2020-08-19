package chapter11;

public class NullCheck {

    // null 참조 문제가 발생된다.
    public String getCarInsuranceName(Person person) {
        return person.getCar().getInsurance().getName();
    }

    // 2개
    public String conservativeGetCarInsuranceName1(Person person) {
        // person이 null일 수도 있으니까
        if (person != null) {
            Car car = person.getCar();
            // car 이 null 일 수도 있다.
            if (car != null) {
                Insurance insurance = car.getInsurance();
                // 이하 생략..
                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }
        //하나라도 null 일 경우 찾지 못한다.
        return "Unknown";
    }

    // 출구가 너무 많다. (4개)
    public String conservativeGetCarInsuranceName2(Person person) {
        if (person == null) {
            return "Unknown";
        }

        Car car = person.getCar();

        if (car == null) {
            return "Unknown";
        }
        Insurance insurance = car.getInsurance();

        if (insurance == null) {
            return "Unknown";
        }

        return insurance.getName();
    }

    // 최신언어 같은경우 아래와 비슷한 코드를 지원한다.(ex 그루비)
    // def carInsuranceName = person?.car?.insurance?.name
}
