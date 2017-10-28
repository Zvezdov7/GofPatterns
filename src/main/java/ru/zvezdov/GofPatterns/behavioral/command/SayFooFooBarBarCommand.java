package ru.zvezdov.GofPatterns.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class SayFooFooBarBarCommand implements Command {
    private final Speaker speaker;

    SayFooFooBarBarCommand(Speaker speaker) {
        this.speaker = speaker;
    }


    @Override
    public void execute() {
        speaker.sayFoo();
        speaker.sayFoo();
        speaker.sayBar();
        speaker.sayBar();
    }
}
