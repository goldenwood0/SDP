package assignment_3;

import java.util.Scanner;

public class Adapter_Pattern {
    public static void main(String[] args) {
        // Create the Adaptee (Human Speaker)
        Human_Speaker adaptee = new Human_Speaker();

        // Create the Adapter (Translator)
        Ant_Speaker translator = new Translator_Adapter(adaptee);

        // Client (Ant Speaker) interacts with the Translator
        System.out.println("Conversation: Speaking in Ant");
        translator.speakInAnt("Hello, how are you?");

        // Accept user input for the English message
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message in Ant: ");
        String Ant_Message = scanner.nextLine();

        // Translate and communicate the message
        translator.speakInAnt(Ant_Message);
    }
}
