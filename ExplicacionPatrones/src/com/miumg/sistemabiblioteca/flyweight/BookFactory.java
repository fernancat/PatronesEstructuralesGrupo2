package com.miumg.sistemabiblioteca.flyweight;

import com.miumg.sistemabiblioteca.adapter.IBook;
import com.miumg.sistemabiblioteca.composite.BookItem;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static final Map<String, IBook> bookMap = new HashMap<>();

    public static IBook getBook(String title) {
        IBook book = bookMap.get(title);
        if (book == null) {
            book = (new BookItem(title));  // Usa el Composite Pattern
            bookMap.put(title, book);
        }
        return book;
    }
}

