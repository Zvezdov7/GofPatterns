package ru.zvezdov.GofPatterns.behavioral.state;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
abstract class State {
    final IceCreamStore store;

    State(IceCreamStore store) {
        this.store = store;
    }

    abstract void buyIceCream();
    abstract void askQuestion();
    abstract void closeTheDoor();
}
