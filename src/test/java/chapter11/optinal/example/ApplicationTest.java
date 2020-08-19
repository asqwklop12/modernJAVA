package chapter11.optinal.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
    static Properties props = new Properties();

    static {
        props.setProperty("a", "5");
        props.setProperty("b", "true");
        props.setProperty("c", "-3");
    }

    Application application;

    @Before
    public void init() {
        application = new Application();
    }

    @Test
    public void readDuration() {
        assertEquals(5, Application.readDuration(props, "a"));
        assertEquals(0, Application.readDuration(props, "b"));
        assertEquals(0, Application.readDuration(props, "c"));
        assertEquals(0, Application.readDuration(props, "d"));
    }
}