package com.miumg.sistemabiblioteca.facade;

import com.miumg.sistemabiblioteca.adapter.IBook;

import java.util.List;

public class LibraryFacade {
    private BookCollection bookCollection = new BookCollection();

    public void addBookToLibrary(String title) {
        IBook book = new Book(title);
        bookCollection.addBook((Book) book);
    }

    public void searchAndDisplayBooks(String query) {
        List<Book> books = bookCollection.searchBooks(query);
        for (Book book : books) {
            book.display();
        }
    }
}
