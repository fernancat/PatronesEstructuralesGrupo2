package com.miumg.sistemabiblioteca.bridge.bookdata;

public class DatabaseBookData implements  BookData {
    public String getContent() {
        return "Contenido del libro desde la base de datos";
    }
}
