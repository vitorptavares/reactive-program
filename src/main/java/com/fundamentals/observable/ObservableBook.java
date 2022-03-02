package com.fundamentals.observable;

import java.util.ArrayList;

public class ObservableBook implements SubjectLibrary{

    String name;
    String type;
    String author;
    double price;
    private String inStock;
    private ArrayList<Observer> observerSubscribedList = new ArrayList<>();

    @Override
    public void subscribeObserver(Observer obj) {
        observerSubscribedList.add(obj);

    }

    @Override
    public void registerObserver(Observer obj) {

    }

    @Override
    public void notifyObserver() {

        System.out.println("Book: " + this.name + "" +
                "Is now " + inStock + " please notify all users");
        observerSubscribedList.stream().forEach(observer -> observer.update(this.inStock));

    }

    @Override
    public void unsubscribeObserver(Observer obj) {
        observerSubscribedList.remove(obj);

    }

    public ObservableBook(String name, String type, String author, double price, String inStock) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public ArrayList<Observer> getObserverSubscribedList() {
        return observerSubscribedList;
    }

    public void setObserverSubscribedList(ArrayList<Observer> observerSubscribedList) {
        this.observerSubscribedList = observerSubscribedList;
    }
}
