package Lexicon.Hans.view;

import Lexicon.Hans.Model.Event;
import Lexicon.Hans.Model.Invitation;
import Lexicon.Hans.Model.Participant;

import java.util.List;
import java.util.Scanner;

public class EventAppView {

    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.print("""
                    \nPlease select an option.
                    1. Create and manage Events.
                    2. Register and manage Participants.
                    3. View Events.
                    4. View Participants.
                    0. Exit.
                    """);
    }

    public static void displayEventMenu() {
        System.out.print("""
                    \nPlease select an option.
                    1. Create Event.
                    2. Update Event.
                    3. Delete Event.
                    0. Return to Main.
                    """);
    }

    public static void displayParticipantMenu() {
        System.out.print("""
                    \nPlease select an option.
                    1. Register Participant.
                    2. Update Participant.
                    3. Delete Participant.
                    0. Return to Main.
                    """);
    }

    public static String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static void displayEvents(List<Event> events) {
        if (events.isEmpty()) {
            System.out.println("List is empty.");
        }

        System.out.println("\nAll Events.");
        System.out.println("ID Title");
        System.out.println("-------------------------------------------");
        events.forEach(System.out::println);
    }

    public static void displayParticipants(List<Participant> participants) {
        if (participants.isEmpty()) {
            System.out.println("List is empty.");
        }

        System.out.println("\nAll Participants.");
        System.out.println("ID Name");
        participants.forEach(System.out::println);
    }

    public static void displayInvitations(List<Invitation> invitations) {
        if (invitations.isEmpty()) {
            System.out.println("List is empty.");
        }

        System.out.println("\nAll Invitations.");
    }

}