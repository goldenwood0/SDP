package assignment_2;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Coffee Shop!");
            System.out.println("Select a coffee type:");
            System.out.println("1. Espresso");
            System.out.println("2. Cappuccino");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for visiting!");
                break;
            }

            Coffee coffee;
            switch (choice) {
                case 1:
                    coffee = new Espresso();
                    break;
                case 2:
                    coffee = new Cappuccino();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }

            while (true) {
                System.out.println("Customize your coffee:");
                System.out.println("1. Add Milk");
                System.out.println("2. Add Sugar");
                System.out.println("3. Finish Order");
                System.out.print("Enter your choice: ");

                int customChoice = scanner.nextInt();

                if (customChoice == 3) {
                    System.out.println("Order: " + coffee.getDescription());
                    System.out.println("Cost: $" + coffee.cost());
                    break;
                }

                switch (customChoice) {
                    case 1:
                        coffee = new MilkDecorator(coffee);
                        break;
                    case 2:
                        coffee = new SugarDecorator(coffee);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
            }
        }

        scanner.close();
    }
}