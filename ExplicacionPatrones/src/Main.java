import com.miumg.sistemabiblioteca.adapter.IBook;
import com.miumg.sistemabiblioteca.adapter.epub.EpubAdapter;
import com.miumg.sistemabiblioteca.adapter.epub.EpubBook;
import com.miumg.sistemabiblioteca.adapter.pdf.PdfAdapter;
import com.miumg.sistemabiblioteca.adapter.pdf.PdfBook;
import com.miumg.sistemabiblioteca.bridge.bookdata.BookData;
import com.miumg.sistemabiblioteca.bridge.bookdata.DatabaseBookData;
import com.miumg.sistemabiblioteca.bridge.bookdata.DetelleBookViewPortada;
import com.miumg.sistemabiblioteca.bridge.bookview.BookView;
import com.miumg.sistemabiblioteca.bridge.bookview.DetailedBookView;
import com.miumg.sistemabiblioteca.composite.BookCategory;
import com.miumg.sistemabiblioteca.composite.BookItem;
import com.miumg.sistemabiblioteca.decorator.BorderDecorator;
import com.miumg.sistemabiblioteca.decorator.HighlightedIBook;
import com.miumg.sistemabiblioteca.decorator.NotedBook;
import com.miumg.sistemabiblioteca.facade.LibraryFacade;
import com.miumg.sistemabiblioteca.flyweight.BookFactory;
import com.miumg.sistemabiblioteca.proxy.BookProxy;

public class Main {
    public static void main(String[] args) {
        // Adapter Pattern
        IBook pdfBook = new PdfAdapter(new PdfBook());
        IBook epubBook = new EpubAdapter(new EpubBook());

        pdfBook.display();
        epubBook.display();

        // Bridge Pattern
        BookData dbData = new DatabaseBookData();
        BookView bookView = new DetailedBookView(dbData);
        BookView Portada = new DetelleBookViewPortada(dbData);

        dbData.getContent();
        bookView.display();

        // Composite Pattern
        BookItem book1 = new BookItem("El Hobbit");
        BookItem book2 = new BookItem("Harry Potter");
        BookCategory fantasyCategory = new BookCategory("Fantasía");
        fantasyCategory.addComponent(book1);
        fantasyCategory.addComponent(book2);

        book1.showDetails();
        book2.display();

        // Decorator Pattern
        IBook highlightedBook = new HighlightedIBook(pdfBook);
        IBook notedBook = new NotedBook(epubBook);
        IBook libroBordeado = new BorderDecorator(pdfBook);
        IBook libroConNotasYresaltado = new HighlightedIBook(notedBook);

        libroConNotasYresaltado.display();
        notedBook.display();


        // Facade Pattern
        LibraryFacade library = new LibraryFacade();
        library.addBookToLibrary("El Hobbit");
        library.searchAndDisplayBooks("El");

        // Flyweight Pattern
        IBook book3 = BookFactory.getBook("El Hobbit");
        IBook book4 = BookFactory.getBook("Harry Potter");

        // Proxy Pattern
        IBook proxyBook = new BookProxy("Cien Años de Soledad", true);
        proxyBook.display();
    }
}