package com.cc.java;

import com.cc.java.observer.Observer;
import com.cc.java.subject.Subject;

public class App {
    
    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer o1 = new Observer("Abbonent 1", subject);
        Observer o2 = new Observer("Abbonent 2", subject);

        subject.setState("Init Status");
        Logger.ausgabe("-------------");
        subject.setState("neues Video ist da!");
        Logger.ausgabe("-------------");
        subject.detach(o2); // o2 meldet sich ab!
        subject.setState("neuer Newsletter ist da!");
        Logger.ausgabe("-------------");
        Observer o3 = new Observer("Abbonent 3", subject);
        subject.setState("Breaking news!");
    
    }

}
