package chapter09.flex;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerE {

    Logger logger = Logger.getLogger("start");

    public void loggers() {
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Problem: " + generateDiagnostic());
        }

        // 위 보다 이게 바람직
        logger.log(Level.FINER, "Problem:" + generateDiagnostic());

        // 가능 supplier
        logger.log(Level.FINER, () -> "Problem: " + generateDiagnostic());


    }

    private String generateDiagnostic() {
        return "임시";
    }
}
