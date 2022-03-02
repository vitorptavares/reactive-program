package com.fundamentals.observable;

import java.awt.print.Book;

public class Test {



    public static void main(String[] args) {
        ObservableBook book = new ObservableBook("Como ler livros", "teaching", " Mortimer Adler" , 85, "avaliable");

        EndUser user1 = new EndUser("Vitor", book);

        EndUser user2 = new EndUser("Priscila", book);

        book.notifyObserver();

        book.setInStock("unavaliable");

        book.notifyObserver();


    }
}
