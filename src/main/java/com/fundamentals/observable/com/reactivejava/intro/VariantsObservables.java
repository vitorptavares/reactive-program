package com.fundamentals.observable.com.reactivejava.intro;


import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Single;

public class VariantsObservables {

    public static void main(String[] args) {
        Observable<String> source = Observable.just("Levi", "Priscila", "Vitor");
        Observable<String> empty = Observable.empty();

        //first method return a default value if no event is emitted
        source.first("Vitor").subscribe(System.out::println);
        //prints default value since it´s subscribing an empty observable
        empty.first("Vitor").subscribe(System.out::println);

        Single.just("Priscila").subscribe(System.out::println);

        //this is the maybeObserver. If none event is emitted than last consumer is executed
        empty.firstElement().subscribe(s -> System.out.println(s), throwable -> System.out.println(throwable), () -> System.out.println("completed"));



    }
}
