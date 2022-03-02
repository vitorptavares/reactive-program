package com.fundamentals.observable.com.reactivejava.intro;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

public class ColdObservable {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(11);
        integers.add(12);

        //fromIterable emits a new event for every item of iterable
        Observable<Integer> coldObservable = Observable.fromIterable(integers);

        coldObservable.subscribe(integer -> System.out.println(integer));

        integers.add(13);
        //following observer will listen all events as previous observer + integers.add(13). This is cold Observable
        coldObservable.subscribe(integer -> System.out.println(integer));

    }
}
