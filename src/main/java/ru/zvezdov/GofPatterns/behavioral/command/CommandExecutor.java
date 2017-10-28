package ru.zvezdov.GofPatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Invoker Class
 *
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class CommandExecutor {
    private List<Command> commands;

    CommandExecutor() {
        commands = new ArrayList<>();
    }

    void addCommand(Command command) {
        commands.add(command);
    }

    void run() {
        if (commands != null) {
            for (Command command : commands) {
                command.execute();
            }
        }
    }
}
