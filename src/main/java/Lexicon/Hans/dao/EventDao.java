package Lexicon.Hans.dao;

import Lexicon.Hans.Model.Event;

import java.util.List;

//Responsible for access to Event Objects.
public interface EventDao {
    void save(Event event);
    void delete(String id);
    List<Event> findAll();
    Event findById(String id);
}
