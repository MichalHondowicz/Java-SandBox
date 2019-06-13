package com.micHon.order;

import com.micHon.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
