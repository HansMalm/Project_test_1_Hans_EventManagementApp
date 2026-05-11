package Lexicon.Hans.dao;

import Lexicon.Hans.Model.Participant;

import java.util.List;

//Responsible for access to Participant Objects.
public interface ParticipantDao {
    void save(Participant participant);
    List<Participant> findAll();
    void delete(String id);
}
