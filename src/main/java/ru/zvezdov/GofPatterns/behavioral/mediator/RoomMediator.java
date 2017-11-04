package ru.zvezdov.GofPatterns.behavioral.mediator;

/**
 * Created by Dmitry on 30.10.2017.
 */
abstract class RoomMediator {
    abstract void say(String message, RoomUser user);
}
