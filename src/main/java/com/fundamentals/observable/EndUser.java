package com.fundamentals.observable;

public class EndUser implements Observer{
    String name;

    public EndUser(String name, SubjectLibrary subjectLibrary) {
        this.name = name;
        subjectLibrary.subscribeObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String val) {
        System.out.println("Hello " + name  + "! we want to notify you that your book is now: " + val);

    }
}
