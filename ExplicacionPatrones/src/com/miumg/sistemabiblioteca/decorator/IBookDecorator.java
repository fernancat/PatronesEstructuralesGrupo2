package com.miumg.sistemabiblioteca.decorator;


import com.miumg.sistemabiblioteca.adapter.IBook;

public abstract class IBookDecorator implements IBook {
    protected IBook decoratedIBook;

    public IBookDecorator(IBook decoratedIBook) {
        this.decoratedIBook = decoratedIBook;
    }


    @Override
    public void display() {
        decoratedIBook.display();
    }
}
