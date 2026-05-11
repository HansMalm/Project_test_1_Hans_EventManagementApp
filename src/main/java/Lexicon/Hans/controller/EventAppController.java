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

    public void run() {
        boolean running = true;
        System.out.println("\nWelcome to Event Manager!");
        while (running) {
            EventAppView.displayMainMenu();
            String input = EventAppView.getUserInput("Choose an option: ");

            switch (input) {
                case "1":
                    createEvent();
                    break;
                case "2":
                    createParticipant();
                    break;
                case "3":
                    viewEvents();
                    break;
                case "4":
                    viewParticipants();
                    break;
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
        String title = EventAppView.getUserInput("Event Title: ");

        eventDao.save(new Event(title));
    }

    private void createParticipant() {
        String name = EventAppView.getUserInput("Name: ");

        participantDao.save(new Participant(name));
    }

    private void viewEvents() {
        List<Event> events = eventDao.findAll();
        EventAppView.displayEvents(events);
    }

    private void viewParticipants() {
        List<Participant> participants = participantDao.findAll();
        EventAppView.displayParticipants(participants);
    }

    private void viewInvitations() {
        List<Invitation> invitations = invitationDao.findAll();
        //EventAppView.d
    }
}