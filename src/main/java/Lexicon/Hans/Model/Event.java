package Lexicon.Hans.Model;

import java.time.LocalDateTime;
import java.time.Period;

//Each Event should have a startDate in the future. And the maximum capacity should be respected.
public class Event {

    int id;
    String title;
    //String description;
    //String location;
    //LocalDateTime startDate;
    //Period duration;
    //int capacity

    public Event(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Event(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Rewrite this method, it currently is tailored for event menu methods.
    @Override
    public String toString() {
        return id + ": " + title;
    }
}
