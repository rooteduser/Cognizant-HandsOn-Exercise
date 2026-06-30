package SingletonPatternExample;

public class SingletonTest{
    public static void main(String[] args){
        // Retrieve two separate references to the Logger instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use the logger to log messages
        logger1.log("Application started.");
        logger2.log("Performing operation A.");

        // Verify that both references point to the exact same memory address (same instance)
        System.out.println("\n--- Verification ---");
        System.out.println("Logger 1 HashCode: " + logger1.hashCode());
        System.out.println("Logger 2 HashCode: " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both logger1 and logger2 point to the exact same instance!");
        } else {
            System.out.println("FAILURE: Multiple instances of the logger exist.");
        }
    }
}