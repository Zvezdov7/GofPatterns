package ru.zvezdov.GofPatterns.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        executor.addCommand(new SayFooBarCommand(new Speaker()));
        executor.addCommand(new SayFooFooBarBarCommand(new Speaker()));

        executor.run();

    }
}
