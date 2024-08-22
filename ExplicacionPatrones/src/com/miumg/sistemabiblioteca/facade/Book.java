package com.miumg.sistemabiblioteca.facade;

import com.miumg.sistemabiblioteca.adapter.IBook;

public class Book implements IBook {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void display(){
        System.out.println("Title: " + title);
    }
}