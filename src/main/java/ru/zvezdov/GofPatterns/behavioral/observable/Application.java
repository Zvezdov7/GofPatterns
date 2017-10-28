package ru.zvezdov.GofPatterns.behavioral.observable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        NotificationSystem system = new NotificationSystem();
        NotificationListener listener = new NotificationListener(system);
        logger.info("Sending an important notification!");
        system.notify("Important notification!");

    }
}
