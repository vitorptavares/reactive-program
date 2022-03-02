package com.fundamentals.observable.com.reactivejava.intro;

import io.reactivex.Observable;

public class CreatingObservable {

    public static void main(String[] args) {

        Observable<String> observable = Observable.
                create(observableEmitter -> {
                    //onnext emits the event
                    observableEmitter.onNext("Hello");
                    observableEmitter.onNext("Hello again");
                });

        //to listener the events we need subscribe
        //here we are subscribing observer s to observable observableEmitter
        observable.subscribe(s -> System.out.println(s));

        //Another way to call onnext method
        //just calls onnext X times according X arguments passed in just method
        Observable<Integer> observableTwo = Observable.just(1, 2, 3, 4);
        observableTwo.subscribe(s -> System.out.println(s));

        System.out.println("separator");

        //range method calls onnext according rage values start and count. Bellow example prints 3 to 12
        Observable observableThree = Observable.range(3, 10);
        observableThree.subscribe(s -> System.out.println(s));
    }
}
