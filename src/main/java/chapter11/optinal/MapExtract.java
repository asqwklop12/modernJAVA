package chapter11.optinal;

import java.util.Optional;

public class MapExtract {

    public String getName(Insurance insurance) {
        String name = null;
        if (insurance != null) {
            name = insurance.getName();
        }
        return name;
    }

    public Optional<Insurance> optInsurance(Insurance insurance) {
        return Optional.ofNullable(insurance);
    }

    public Optional<String> name(Insurance insurance) {
        return optInsurance(insurance).map(Insurance::getName);
    }

}
