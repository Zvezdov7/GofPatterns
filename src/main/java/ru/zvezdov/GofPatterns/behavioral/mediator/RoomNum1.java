package ru.zvezdov.GofPatterns.behavioral.mediator;

/**
 * Created by Dmitry on 30.10.2017.
 */
class RoomNum1 extends RoomMediator {
    private RoomUserMiranda miranda;
    private RoomUserSamanta samanta;

    @Override
    void say(String message, RoomUser user) {
        if (user.equals(miranda)) {
            samanta.listenSomebody(message);
        } else miranda.listenSomebody(message);
    }

    void setMiranda(RoomUserMiranda miranda) {
        this.miranda = miranda;
    }

    void setSamanta(RoomUserSamanta samanta) {
        this.samanta = samanta;
    }
}
