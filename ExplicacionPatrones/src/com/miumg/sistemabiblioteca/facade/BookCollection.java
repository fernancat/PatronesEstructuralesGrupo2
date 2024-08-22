package com.miumg.sistemabiblioteca.facade;



import com.miumg.sistemabiblioteca.adapter.IBook;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books = new ArrayList<>();

    public void addBook(IBook book) {
        books.add((Book) book);
    }

    public List<Book> searchBooks(String query) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }
}