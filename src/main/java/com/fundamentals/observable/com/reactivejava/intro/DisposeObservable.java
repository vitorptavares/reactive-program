package com.fundamentals.observable.com.reactivejava.intro;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class DisposeObservable {

    public static void main(String[] args) throws InterruptedException {

        //When onComplete is called, the object is ready to go to garbage collector. But if we want to stop receiving events, we can
        //dispose
        ConnectableObservable<Long> obs1 = Observable.interval(1, TimeUnit.SECONDS).publish();

        obs1.connect();

        Disposable subscribe = obs1.subscribe(aLong -> System.out.println("OBS 1: " + aLong));
        Thread.sleep(10000);

        subscribe.dispose();
        obs1.subscribe(aLong -> System.out.println("OBS 2: " + aLong));
        Thread.sleep(10000);
    }
}
