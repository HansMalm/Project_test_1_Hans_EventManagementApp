package Lexicon.Hans.dao;

import Lexicon.Hans.Model.Event;

import java.util.List;

public interface EventDao {
    void save(Event event);
    List<Event> findAll();
}
