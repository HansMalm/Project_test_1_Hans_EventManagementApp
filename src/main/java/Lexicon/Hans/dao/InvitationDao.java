package Lexicon.Hans.dao;

import Lexicon.Hans.Model.Invitation;

import java.util.List;

//Responsible for access to Invitation Objects.
public interface InvitationDao {
    void save(Invitation invitation);
    List<Invitation> findAll();
}