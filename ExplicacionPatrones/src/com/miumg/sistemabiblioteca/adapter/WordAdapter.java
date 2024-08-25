package com.miumg.sistemabiblioteca.adapter;

public class WordAdapter implements IBook{
    private WordBook wordAdapter;

    public WordAdapter(WordBook wordBook) {
        this.wordAdapter = wordBook;
    }

    @Override
    public void display(){
        wordAdapter.displayWord();
    }
}
