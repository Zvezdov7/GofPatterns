package ru.zvezdov.GofPatterns.behavioral.state;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class IceCreamStore {
    private State state;
    private String signboard;


    State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    String getSignboard() {
        return signboard;
    }

    void setSignboard(String signboard) {
        this.signboard = signboard;
    }
}
