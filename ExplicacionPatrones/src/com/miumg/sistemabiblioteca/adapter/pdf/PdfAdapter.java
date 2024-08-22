package com.miumg.sistemabiblioteca.adapter.pdf;

import com.miumg.sistemabiblioteca.adapter.IBook;

public class PdfAdapter implements IBook {
    private PdfBook pdfBook;

    public PdfAdapter(PdfBook pdfBook) {
        this.pdfBook = pdfBook;
    }

    @Override
    public void display() {
        pdfBook.showPdf();
    }
}