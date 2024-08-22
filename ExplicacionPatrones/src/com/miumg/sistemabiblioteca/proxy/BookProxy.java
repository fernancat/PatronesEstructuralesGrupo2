package com.miumg.sistemabiblioteca.proxy;

import com.miumg.sistemabiblioteca.adapter.IBook;

public class BookProxy implements IBook {
    private Realbook realBook;
    private String title;
    private boolean isAuthorized;

    public BookProxy(String title, boolean isAuthorized) {
        this.title = title;
        this.isAuthorized = isAuthorized;
    }

    @Override
    public void display() {
        if (isAuthorized) {
            if (realBook == null) {
                realBook = new Realbook(title);
            }
            realBook.display();
        } else {
            System.out.println("Acceso denegado a " + title);
        }
    }
}