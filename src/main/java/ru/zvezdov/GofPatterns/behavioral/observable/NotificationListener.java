package ru.zvezdov.GofPatterns.behavioral.observable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class NotificationListener implements Observer {
    private static final Logger logger = LoggerFactory.getLogger(NotificationListener.class);

    NotificationListener(NotificationSystem system) {
        system.registerObserver(this);
    }

    @Override
    public void update(String notification) {
        logger.info("NotificationListener received a notification: " + notification);
    }
}
