package ru.zvezdov.GofPatterns.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class OpenState extends State {
    private static final Logger logger = LoggerFactory.getLogger(OpenState.class);

    OpenState(IceCreamStore store) {
        super(store);
        store.setSignboard("We're open, hello!");
    }

    @Override
    void buyIceCream() {
        logger.info("Hi dear, take it please");
    }

    @Override
    void askQuestion() {
        logger.info("Answer the question");
    }

    @Override
    void closeTheDoor() {
        logger.info("The door is open, come on");
        store.setSignboard("Closed");
        store.setState(new ClosedState(store));
    }
}
