package ru.zvezdov.GofPatterns.behavioral.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Dmitry on 30.10.2017.
 */
class RoomUserMiranda extends RoomUser {
    private static final Logger logger = LoggerFactory.getLogger(RoomUserMiranda.class);
    RoomUserMiranda(RoomMediator room) {
        super(room);
    }

    @Override
    void listenSomebody(String message) {
        logger.info("Miranda listen the message: " + message);
    }


}
