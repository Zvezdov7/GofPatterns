package ru.zvezdov.GofPatterns.behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * Receiver class
 *
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class Speaker {
    private static final Logger logger= LoggerFactory.getLogger(Speaker.class);

    void sayFoo() {
        logger.info("Foo!");
    }

    void sayBar() {
        logger.info("Bar!");
    }
}
