package ru.zvezdov.GofPatterns.behavioral.mediator;

/**
 * Created by Dmitry on 30.10.2017.
 */
public class Application {
    public static void main(String[] args) {
        RoomNum1 room = new RoomNum1();
        RoomUserMiranda miranda = new RoomUserMiranda(room);
        RoomUserSamanta samanta = new RoomUserSamanta(room);

        room.setMiranda(miranda);
        room.setSamanta(samanta);

        samanta.say("Hello");
        miranda.say("Hi");
    }
}
