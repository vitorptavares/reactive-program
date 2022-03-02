package com.fundamentals.observable;


public interface SubjectLibrary {

    public void subscribeObserver(Observer obj);

    public void registerObserver(Observer obj);

    public void notifyObserver();

    public void unsubscribeObserver(Observer obj);
}
