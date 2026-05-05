package Lexicon.Hans.dao;

import Lexicon.Hans.dao.Event;

public interface EventDao {
    Event save(Event event);
    List<Event> findAll();
}
