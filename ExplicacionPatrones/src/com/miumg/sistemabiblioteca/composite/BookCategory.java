package com.miumg.sistemabiblioteca.composite;

import java.util.ArrayList;
import java.util.List;

public class BookCategory implements LibraryComponent {
    private String name;
    private List<LibraryComponent> components = new ArrayList<>();

    public BookCategory(String name) {
        this.name = name;
    }

    public void addComponent(LibraryComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Categoría: " + name);
        for (LibraryComponent component : components) {
            component.showDetails();
        }
    }
}