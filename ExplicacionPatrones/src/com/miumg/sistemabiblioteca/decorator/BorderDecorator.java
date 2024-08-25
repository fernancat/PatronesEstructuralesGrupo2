package com.miumg.sistemabiblioteca.decorator;

import com.miumg.sistemabiblioteca.adapter.IBook;

public class BorderDecorator extends IBookDecorator{


    public BorderDecorator(IBook book) {
        super(book);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("borde añadido al libro");
    }

}
