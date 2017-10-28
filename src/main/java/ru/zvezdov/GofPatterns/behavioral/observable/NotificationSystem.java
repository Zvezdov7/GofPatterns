package ru.zvezdov.GofPatterns.behavioral.observable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         28.10.2017.
 */
class NotificationSystem implements Observable {
    private List<Observer> observers;
    private String notification;

    NotificationSystem() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (notification != null) {
            for (Observer observer : observers) {
                observer.update(notification);
            }
        }
    }

    void notify(String notification) {
        this.notification = notification;
        notifyObservers();
    }
}
