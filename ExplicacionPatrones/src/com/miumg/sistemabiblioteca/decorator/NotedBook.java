package com.miumg.sistemabiblioteca.decorator;

import com.miumg.sistemabiblioteca.adapter.IBook;

public class NotedBook extends IBookDecorator {
    public NotedBook(IBook decoratedIBook) {
        super(decoratedIBook);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Notas añadidas al libro");
    }
}
