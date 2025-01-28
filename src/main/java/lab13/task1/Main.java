package lab13.task1;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.logMessage("message");
        logger.logError("error");
        logger.logInfo("info");
        logger.logWarning("warning");
    }
}
