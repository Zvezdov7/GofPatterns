package ru.zvezdov.GofPatterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class ClosedState extends State {
    private static final Logger logger = LoggerFactory.getLogger(ClosedState.class);
    ClosedState(IceCreamStore store) {
        super(store);
    }

    @Override
    void buyIceCream() {
        logger.info("Nobody is here");
    }

    @Override
    void askQuestion() {
        logger.info("Nobody is here");
    }

    @Override
    void closeTheDoor() {
        logger.info("Nobody is here");
    }
}
