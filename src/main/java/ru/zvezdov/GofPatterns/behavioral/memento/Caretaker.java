package ru.zvezdov.GofPatterns.behavioral.memento;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class Caretaker {
    private Memento memento;

    void setMemento(Memento memento) {
        this.memento = memento;
    }

    Memento getMemento() {
        return memento;
    }
}
