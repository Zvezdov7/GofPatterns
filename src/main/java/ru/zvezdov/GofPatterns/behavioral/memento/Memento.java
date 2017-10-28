package ru.zvezdov.GofPatterns.behavioral.memento;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class Memento {
    private final String state;

    Memento(String state) {
        this.state = state;
    }


    String getState() {
        return state;
    }
}
