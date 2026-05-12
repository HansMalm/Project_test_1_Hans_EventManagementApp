package Lexicon.Hans.processor.filters;

import Lexicon.Hans.Model.Invitation;

@FunctionalInterface
public interface InvitationFilter {
    boolean matches(Invitation invitation);
}
