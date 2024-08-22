package com.miumg.sistemabiblioteca.composite;

import com.miumg.sistemabiblioteca.adapter.IBook;

public class BookItem implements LibraryComponent, IBook {
    private String title;

    public BookItem(String title) {
        this.title = title;
    }

    @Override
    public void showDetails() {
        System.out.println("Libro: " + title);
    }

    @Override
    public void display() {

    }
}