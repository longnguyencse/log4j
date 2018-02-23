import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    public static void main(String[] args) {
        App app = new App();

        logger.debug("Hello word, debug");
        logger.error("Hello word, error 11111111111111111");
        logger.warn("Hello word, warn");

    }

}
