package ru.zvezdov.GofPatterns.behavioral.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State on");

        logger.info("State: " + originator.getState());
        Memento memento = originator.saveState(originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);

        originator.setState("State off");
        logger.info("State: " + originator.getState());

        originator.restoreState(caretaker.getMemento());
        logger.info("State: " + originator.getState());
    }
}
