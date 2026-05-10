package Lexicon.Hans.Model;

import java.time.LocalDateTime;
import java.time.Period;

public class Event {

    int id;
    String title;
    //String description;
    //String location;
    //LocalDateTime startDate;
    //Period duration;
    //int capacity


    public Event(String title) {
        this.id = 0;
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
}
