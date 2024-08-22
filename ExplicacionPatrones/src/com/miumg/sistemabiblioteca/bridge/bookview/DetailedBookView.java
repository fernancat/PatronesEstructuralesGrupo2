package com.miumg.sistemabiblioteca.bridge.bookview;

import com.miumg.sistemabiblioteca.bridge.bookdata.BookData;

public class DetailedBookView extends BookView {
    public DetailedBookView(BookData bookData) {
        super(bookData);
    }

    @Override
     public void display() {
        System.out.println("Mostrando vista detallada del libro: " + bookData.getContent());
    }
}
