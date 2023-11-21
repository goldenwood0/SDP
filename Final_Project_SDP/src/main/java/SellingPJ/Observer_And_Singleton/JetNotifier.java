package SellingPJ.Observer_And_Singleton;

import java.util.ArrayList;
import java.util.List;

public class JetNotifier {
    private static JetNotifier instance;
    private static List<Observer> observers = new ArrayList<>();

    private JetNotifier() {
        // Private constructor to prevent instantiation outside this class.
    }

    public static JetNotifier getInstance() {
        if (instance == null) {
            instance = new JetNotifier();
        }
        return instance;
    }

    public static void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void newJetArrived() {
        notifyObservers("New jet has arrived! Learn more about it on our website!");
    }
}
