package Lexicon.Hans.processor;

import Lexicon.Hans.Model.Invitation;
import Lexicon.Hans.processor.filters.InvitationFilter;

import java.util.List;
import java.util.stream.Collectors;

public class Processor {

    public List<Invitation> findParticipants(List<Invitation> invitations, InvitationFilter filter) {
        return invitations.stream()
                .filter(filter::matches)
                .collect(Collectors.toList());
    }
}
