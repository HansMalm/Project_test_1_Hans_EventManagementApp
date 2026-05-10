package Lexicon.Hans.Model;

public class Invitation {
    int id;
    Event event;
    Participant participant;
    InviteStatus inviteStatus;

    public Invitation(Event event, Participant participant, InviteStatus inviteStatus) {
        this.id = 0;
        this.event = event;
        this.participant = participant;
        this.inviteStatus = InviteStatus.PENDING;
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
