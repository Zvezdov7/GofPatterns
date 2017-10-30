package ru.zvezdov.GofPatterns.behavioral.mediator;

/**
 * Created by Dmitry on 30.10.2017.
 */
abstract class RoomUser {
    RoomMediator room;

    RoomUser(RoomMediator room) {
        this.room = room;
    }

    void say(String message) {
        room.say(message, this);
    }

    abstract void listenSomebody(String message);
}
