package ru.zvezdov.GofPatterns.behavioral.state;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class Application {
    public static void main(String[] args) {
        IceCreamStore store = new IceCreamStore();
        store.setState(new OpenState(store));

        store.getState().buyIceCream();
        store.getSignboard();
        store.getState().closeTheDoor();
        store.getState().buyIceCream();
        store.getState().askQuestion();
    }
}
