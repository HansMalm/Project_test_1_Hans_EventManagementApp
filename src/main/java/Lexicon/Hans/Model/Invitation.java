package Lexicon.Hans.Model;

public class Invitation {
    int id;
    Event event;
    Participant participant;
    InviteStatus inviteStatus;

    public Invitation(int id, Event event, Participant participant, InviteStatus inviteStatus) {
        this.id = id;
        this.event = event;
        this.participant = participant;
        this.inviteStatus = InviteStatus.PENDING;
    }

    public Invitation(Event event, Participant participant, InviteStatus inviteStatus) {
        this.event = event;
        this.participant = participant;
        this.inviteStatus = inviteStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    @Override
    public String toString() {
        return "Invitation{" + "id=" + id + ", event=" + event + ", participant=" + participant;
    }
}