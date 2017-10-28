package ru.zvezdov.GofPatterns.behavioral.memento;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class Originator {
    private String state;

    void setState(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }

    Memento saveState(String state) {
        return new Memento(state);
    }

    void restoreState(Memento memento) {
        this.state = memento.getState();
    }
}
