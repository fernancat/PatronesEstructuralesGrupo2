package com.miumg.sistemabiblioteca.bridge.bookdata;

import com.miumg.sistemabiblioteca.bridge.bookview.BookView;

public class DetelleBookViewPortada extends BookView {

    public DetelleBookViewPortada(BookData bookData) {
        super(bookData);
    }

    @Override
    public void display() {
        System.out.println("Mostrando la portada del libro");
    }
}

