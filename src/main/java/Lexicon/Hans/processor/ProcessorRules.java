package Lexicon.Hans.processor;

import Lexicon.Hans.Model.InviteStatus;
import Lexicon.Hans.processor.filters.InvitationFilter;

public class ProcessorRules {

    public static InvitationFilter PENDING =
            i -> i.getInviteStatus() == InviteStatus.PENDING;

    public static InvitationFilter ACCEPTED =
            i -> i.getInviteStatus() == InviteStatus.ACCEPTED;

    public static InvitationFilter DECLINED =
            i -> i.getInviteStatus() == InviteStatus.DECLINED;
}
