package Lexicon.Hans.processor.filters;

import Lexicon.Hans.Model.Participant;

@FunctionalInterface
public interface ParticipantFilter {
    boolean matches(Participant participant);
}
