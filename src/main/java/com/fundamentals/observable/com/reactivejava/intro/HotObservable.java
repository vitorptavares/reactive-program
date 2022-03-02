package com.fundamentals.observable.com.reactivejava.intro;


import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.ConnectableObservable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HotObservable {

    public static void main(String[] args) throws InterruptedException {



        ConnectableObservable<Long> publish = Observable.interval(1, TimeUnit.SECONDS).publish();
        publish.connect();

        publish.subscribe(System.out::println);

        Thread.sleep(10000);

        publish.subscribe(System.out::println);
        Thread.sleep(10000);


    }
}
