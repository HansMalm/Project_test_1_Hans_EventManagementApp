package Lexicon.Hans.dao;

import Lexicon.Hans.Model.Participant;

import java.util.List;

public interface ParticipantDao {
    void save(Participant participant);
    List<Participant> findAll();
    void delete(String id);
}
