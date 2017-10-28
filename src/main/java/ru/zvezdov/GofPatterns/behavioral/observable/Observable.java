package ru.zvezdov.GofPatterns.behavioral.observable;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
