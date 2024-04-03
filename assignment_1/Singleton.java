public class Singleton {
    // Private volatile variable to hold the single instance of the class
    private static volatile Singleton instance;

    // Private constructor to prevent direct instantiation
    private Singleton() {
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Method to demonstrate the functionality of the Singleton class
    public void showMessage() {
        System.out.println("Hello, I am a Singleton instance.");
    }
}
