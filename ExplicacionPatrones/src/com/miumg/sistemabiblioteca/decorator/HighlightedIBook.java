package com.miumg.sistemabiblioteca.decorator;


import com.miumg.sistemabiblioteca.adapter.IBook;

public class HighlightedIBook extends IBookDecorator {
    public HighlightedIBook(IBook decoratedIBook) {
        super(decoratedIBook);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Texto resaltado en el libro");
    }
}
