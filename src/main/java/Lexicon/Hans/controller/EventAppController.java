package Lexicon.Hans.controller;

import Lexicon.Hans.Model.Event;
import Lexicon.Hans.Model.Invitation;
import Lexicon.Hans.Model.Participant;
import Lexicon.Hans.dao.EventDao;
import Lexicon.Hans.dao.InvitationDao;
import Lexicon.Hans.dao.ParticipantDao;
import Lexicon.Hans.view.EventAppView;

import java.util.List;

public class EventAppController {

    EventDao eventDao;
    ParticipantDao participantDao;
    InvitationDao invitationDao;
    EventAppView view;

    public EventAppController(EventDao eDao, ParticipantDao pDao, InvitationDao iDao, EventAppView view) {
        this.eventDao = eDao;
        this.participantDao = pDao;
        this.invitationDao = iDao;
        this.view = view;
    }

    public void mainMenu() {
        boolean running = true;
        System.out.println("\nWelcome to Event Manager!");
        while (running) {
            EventAppView.displayMainMenu();
            String input = EventAppView.getUserInput("Choose an option: ");

            switch (input) {
                case "1":
                    eventMenu();
                    break;
                case "2":
                    participantMenu();
                    break;
                case "3":
                    invitationsMenu();
                    break;
                case "4":
                    viewEvents();
                    break;
                case "5":
                    viewParticipants();
                case "0":
                    running = false;
                    EventAppView.displayMessage("Exit Program.");
                    break;
                default:
                    EventAppView.displayMessage("Invalid input!");
            }
        }
    }

    private void createEvent() {
        String title = EventAppView.getUserInput("Enter Event Title: ");

        eventDao.save(new Event(title));
    }

    private void updateEvent() {
        System.out.println("This feature is not yet implemented!");
    }

    private void deleteEvent() {
        viewEvents();
        String id = EventAppView.getUserInput("\nEnter Event ID to Delete: ");

        eventDao.delete(id);
    }

    private void viewEvents() {
        List<Event> events = eventDao.findAll();
        EventAppView.displayEvents(events);
    }

    private void createParticipant() {
        String name = EventAppView.getUserInput("Name: ");

        participantDao.save(new Participant(name));
    }

    private void updateParticipant() {
        System.out.println("This feature is not yet implemented!");
    }

    private void deleteParticipant() {
        viewParticipants();
        String id = EventAppView.getUserInput("\nEnter Participant ID to Delete: ");
        participantDao.delete(id);
    }

    private void viewParticipants() {
        List<Participant> participants = participantDao.findAll();
        EventAppView.displayParticipants(participants);
    }

    private void createInvitation() {
        viewEvents();
        String id = EventAppView.getUserInput("\nChoose an Event by ID: ");


    }

    private  void updateInvitation() {
        System.out.println("This feature is not yet implemented!");
    }

    private void deleteInvitation() {
        System.out.println("This feature is not yet implemented!");
    }

    private void viewInvitations() {
        List<Invitation> invitations = invitationDao.findAll();
        EventAppView.displayInvitations(invitations);
    }

    private void eventMenu() {
        boolean running = true;
        while (running) {
            EventAppView.displayEventMenu();
            String input = EventAppView.getUserInput("\nChoose an option: ");

            switch (input) {
                case "1":
                    createEvent();
                    break;
                case "2":
                    updateEvent();
                    break;
                case "3":
                    deleteEvent();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    EventAppView.displayMessage("Invalid input!");
            }
        }
    }

    private void participantMenu() {

        boolean running = true;
        while (running) {
            EventAppView.displayParticipantMenu();
            String input = EventAppView.getUserInput("\nChoose an option: ");

            switch (input) {
                case "1":
                    createParticipant();
                    break;
                case "2":
                    updateParticipant();
                    break;
                case "3":
                    deleteParticipant();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    EventAppView.displayMessage("Invalid input!");
            }
        }

    }

    private void invitationsMenu() {


        boolean running = true;
        while (running) {
            EventAppView.displayInvitationsMenu();
            String input = EventAppView.getUserInput("\nChoose an option: ");

            switch (input) {
                case "1":
                    createInvitation();
                    break;
                case "2":
                    updateInvitation();
                    break;
                case "3":
                    deleteInvitation();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    EventAppView.displayMessage("Invalid input!");
            }
        }
    }
}