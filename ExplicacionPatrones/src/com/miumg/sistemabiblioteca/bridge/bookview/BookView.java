package com.miumg.sistemabiblioteca.bridge.bookview;

import com.miumg.sistemabiblioteca.bridge.bookdata.BookData;

public abstract class BookView {
    protected BookData bookData;

    public BookView(BookData bookData) {
        this.bookData = bookData;
    }

    public abstract void display();
}