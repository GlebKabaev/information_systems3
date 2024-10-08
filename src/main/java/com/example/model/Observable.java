package com.example.model;

import java.util.ArrayList;
import java.util.List;

import com.example.controller.Observer;

public interface Observable {
    List<Observer> observers = new ArrayList<>();

    default void addObserver(Observer observer) {
        observers.add(observer);
    }

    default void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    default void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
