package Lexicon.Hans.dao;

import Lexicon.Hans.Model.Invitation;

import java.util.List;

public interface InvitationDao {
    Invitation save(Invitation invitation);
    List<Invitation> findAll();
}