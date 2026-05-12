package Lexicon.Hans.processor.filters;

import Lexicon.Hans.Model.Event;

@FunctionalInterface
public interface EventFilter {
    boolean matches(Event event);
}