package com.cc.java.subject;

import com.cc.java.observer.Observer;

public interface Observable {

  public abstract void attach(Observer o);
  public abstract void detach(Observer o);
  public abstract void notifyObservers();
    
}
