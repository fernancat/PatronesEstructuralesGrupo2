package com.miumg.sistemabiblioteca.proxy;

import com.miumg.sistemabiblioteca.adapter.IBook;

public class Realbook  implements  IBook{
    private String title;

    public Realbook(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Cargando libro " + title);
    }

    @Override
    public void display() {
        System.out.println("Mostrando libro: " + title);
    }


}
