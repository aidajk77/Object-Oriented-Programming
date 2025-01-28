package lab13.task1;

public class Logger {
    private static Logger instance;
    private Logger() {}
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void logMessage(String message) {
        System.out.println("Logged: " + message);
    }
    public void logInfo(String message) {
        System.out.println("Info: " + message);
    }
    public void logWarning(String message) {
        System.out.println("Warning: " + message);
    }
    public void logError(String message) {
        System.out.println("Error: " + message);
    }
}
