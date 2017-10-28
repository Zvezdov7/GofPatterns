package ru.zvezdov.GofPatterns.behavioral.command;

/**
 *
 * Command
 *
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class SayFooBarCommand implements Command {
    private final Speaker speaker;

    SayFooBarCommand(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void execute() {
        speaker.sayFoo();
        speaker.sayBar();
    }
}
