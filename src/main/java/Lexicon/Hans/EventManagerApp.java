package Lexicon.Hans;

import java.util.Scanner;

public class EventManagerApp {
    static void main() {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        System.out.println("\nWelcome to Event Manager!");

        while (mainLoop) {
            System.out.print("""
                    Please select an option by input number.
                    1. Create a new Event.
                    2. Register participant.
                    3. View Events.
                    4. View Participants.
                    5. Exit.
                    """);
            System.out.print("Input: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Exit. Program closing.");
                    mainLoop = false;
            }
        }
    }
}
