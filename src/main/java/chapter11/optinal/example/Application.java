package chapter11.optinal.example;

import java.util.Optional;
import java.util.Properties;

public class Application {
    static Properties props = new Properties();

    static {
        props.setProperty("a", "5");
        props.setProperty("b", "true");
        props.setProperty("c", "-3");
    }

    public static int readDuration(Properties props, String name) {
        String value = (String) props.get(name);
        if (value != null) {
            try {
                int i = Integer.parseInt(value);
                if (i > 0) {
                    return i;
                }
            } catch (NumberFormatException nfe) {
            }
        }
        return 0;
    }

    public static int readDuration2(Properties prop, String name) {
        return Optional.ofNullable(prop.getProperty(name))
                .flatMap(ExceptionAndOpticalClass::stringToInt)
                .filter(i -> i > 0)
                .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(readDuration2(props, "a"));
    }
}
