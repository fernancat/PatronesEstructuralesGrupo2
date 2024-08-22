package com.miumg.sistemabiblioteca.adapter.epub;

import com.miumg.sistemabiblioteca.adapter.IBook;

public class EpubAdapter implements IBook {
    private EpubBook epubBook;

    public EpubAdapter(EpubBook epubBook) {
        this.epubBook = epubBook;
    }

    @Override
    public void display() {
        epubBook.displayEpub();
    }
}