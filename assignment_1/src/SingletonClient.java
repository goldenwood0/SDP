public class SingletonClient {
    public static void main(String[] args) {
        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Demonstrate the Singleton functionality
        singleton.showMessage();

        // Try to create another instance (it should return the same instance)
        Singleton anotherSingleton = Singleton.getInstance();

        // Check if both instances are the same
        if (singleton == anotherSingleton) {
            System.out.println("Both patterns are the same. Singleton is keep working.");
        } else {
            System.out.println("Singleton is not working.");
        }
    }
}
