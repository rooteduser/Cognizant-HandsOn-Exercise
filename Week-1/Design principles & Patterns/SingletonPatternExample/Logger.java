package SingletonPatternExample;

public class Logger {
    // 1. Private static instance of the class (volatile ensures visibility across threads)
    private static volatile Logger instance;

    // 2. Private constructor to prevent instantiation from other classes
    private Logger() {
        // Optional: Protect against reflection attacks
        if (instance != null) {
            throw new IllegalStateException("Logger instance already created.");
        }
    }

    // 3. Public static method to provide global access to the single instance
    public static Logger getInstance() {
        // First check (no locking for efficiency if instance already exists)
        if (instance == null) {
            // Synchronize on the class level to prevent multiple threads from creating separate instances
            synchronized (Logger.class) {
                // Second check inside the synchronized block
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // A sample logging method to demonstrate utility functionality
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}