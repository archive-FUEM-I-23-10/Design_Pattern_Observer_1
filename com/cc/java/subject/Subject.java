package com.cc.java.subject;

import com.cc.java.observer.Observer;
import java.util.List;
import java.util.ArrayList;

public class Subject implements Observable{

    private String state;
    private List<Observer> observers =  new ArrayList<>();

    @Override  // registration interface
    public void attach(Observer o) {
        observers.add(o); // Objekte können sich anmelden (abbonieren)
    }

    @Override // deregistration interface
    public void detach(Observer o) {
        observers.remove(o); // Objekte können sich abmelden
    }

    @Override // notification interface
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(); // ALLE Objekte werden benachrichtigt
        }     
    }

    // getter
    public String getState() {
        return state;
    }

    // setter
    public void setState(String state) {
        this.state = state;
        notifyObservers(); // Trigger für Benachrichtigung
    }


}
