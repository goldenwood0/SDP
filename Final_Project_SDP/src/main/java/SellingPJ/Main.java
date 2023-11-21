package SellingPJ;

import SellingPJ.Adapter.EnginePowerAdapter;
import SellingPJ.Factory_And_Decorator.*;
import SellingPJ.Strategy.*;
import SellingPJ.Observer_And_Singleton.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JetFactory jetFactory = new JetFactory();
        Jet jet = null;

        JetNotifier jetNotifier = JetNotifier.getInstance(); // Retrieve the singleton instance
        List<Observer> observers = new ArrayList<>();

        System.out.println("Welcome to the Jet Customization App!");

        while (true) {
            System.out.println("Select the jet type:");
            System.out.println("1. Luxury");
            System.out.println("2. Business");
            int jetTypeChoice = scanner.nextInt();
            scanner.nextLine();

            String jetType;
            int enginePower;
            int wingSize;
            int bodySize;

            switch (jetTypeChoice) {
                case 1:
                    jetType = "Luxury";
                    enginePower = 500;
                    wingSize = getUserInput(scanner, "Enter wingspan for Luxury jet (14 - 20 meters):", 14, 20);
                    bodySize = getUserInput(scanner, "Enter body length for Luxury jet (12 - 18 meters):", 12, 18);
                    break;
                case 2:
                    jetType = "Business";
                    enginePower = 300;
                    wingSize = getUserInput(scanner, "Enter wingspan for Business jet (9 - 15 meters):", 9, 15);
                    bodySize = getUserInput(scanner, "Enter body length for Business jet (9 - 13 meters):", 9, 13);
                    break;
                default:
                    System.out.println("Invalid choice! Please select again.");
                    continue;
            }

            jet = jetFactory.createJet(jetType, enginePower, wingSize, bodySize);

            if (jet != null) {
                System.out.println("Jet created successfully!");
                System.out.println("Do you want to customize your jet? (yes/no)");
                String customizeChoice = scanner.nextLine();
                Client clientObserver = new Client();
                jetNotifier.addObserver(clientObserver);
                observers.add(clientObserver);

                if (customizeChoice.equalsIgnoreCase("yes")) {
                    customizeJet(jet, scanner);
                }

                System.out.println("Final Jet Details:");
                jet.start();
                System.out.println("Select transportation method:");
                System.out.println("1. Air Transport");
                System.out.println("2. Road Transport");
                System.out.println("3. Water Transport");
                int transportChoice = scanner.nextInt();
                scanner.nextLine();
                TransportStrategy transportStrategy;
                if (transportChoice == 1) {
                    transportStrategy = new AirTransport();
                } else if (transportChoice == 2) {
                    transportStrategy = new RoadTransport();
                } else if (transportChoice == 3) {
                    transportStrategy = new WaterTransportAdapter();
                } else {
                    System.out.println("Invalid choice! Defaulting to Air Transport.");
                    transportStrategy = new AirTransport();
                }
                jetNotifier.newJetArrived();
                jet.setTransportStrategy(transportStrategy);
                System.out.println("Here's the Your New Jet, and his characteristics:\n1. " + jet.getEnginePower() + " Horse power.\n2. " + jet.getBodySize() + " meters long of body.\n3. " + jet.getWingSize() + " meters of wingspan");
                jet.getTransportStrategy(transportStrategy);
                JetWithComponents jetWithComponents = (JetWithComponents) jet;
                System.out.println(jetWithComponents.getSeatColor() + " is the color of seats");
                System.out.println(jetWithComponents.getWingColor() + " is the color of wings");
                System.out.println("Increasing Engine Power...");
                EnginePowerAdapter enginePowerAdapter = new EnginePowerAdapter((JetWithComponents) jet);
                enginePowerAdapter.start();
            }
            System.out.println("Do you want to delete an observer? (yes/no)");
            String deleteChoice = scanner.nextLine().toLowerCase();
            if (deleteChoice.equals("yes") && !observers.isEmpty()) {
                Observer observerToDelete = observers.get(observers.size() - 1);
                jetNotifier.removeObserver(observerToDelete);
                observers.remove(observerToDelete);
                System.out.println("Observer deleted.");
            }

            System.out.println("Do you want to create another jet? (yes/no)");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
                break;
            }
        }
        scanner.close();
    }

    private static void customizeJet(Jet jet, Scanner scanner) {
        System.out.println("Customizing Jet...");
        if (jet instanceof JetWithComponents) {
            JetWithComponents jetWithComponents = (JetWithComponents) jet;
            System.out.println("Would you like to customize color of the seats? (yes/no)");
            String seatChoice = scanner.nextLine().toLowerCase();
            if (seatChoice.equals("yes")) {
                System.out.println("Enter the desired color for the seats:");
                String seatColor = scanner.nextLine();
                jetWithComponents.addComponent(new SeatColorDecorator(new Seat(), seatColor));
            }
        }
        if (jet instanceof JetWithComponents) {
            JetWithComponents jetWithComponents = (JetWithComponents) jet;

            System.out.println("Would you like to customize color of the wings? (yes/no)");
            String wingChoice = scanner.nextLine().toLowerCase();
            if (wingChoice.equals("yes")) {
                System.out.println("Enter the desired color for the wings:");
                String wingColor = scanner.nextLine();
                jetWithComponents.addComponent(new WingColorDecorator(new Wing(), wingColor));
            }
        }
    }

    private static int getUserInput(Scanner scanner, String message, int minValue, int maxValue) {
        int userInput;
        while (true) {
            System.out.println(message);
            userInput = scanner.nextInt();
            scanner.nextLine();
            if (userInput >= minValue && userInput <= maxValue) {
                break;
            }
        }
        return userInput;
    }
}
