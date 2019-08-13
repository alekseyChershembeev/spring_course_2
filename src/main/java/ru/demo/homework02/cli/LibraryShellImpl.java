package ru.demo.homework02.cli;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.table.TableModelBuilder;
import ru.demo.homework02.entity.Author;
import ru.demo.homework02.entity.Book;
import ru.demo.homework02.entity.Genre;
import ru.demo.homework02.service.LibraryServiceImpl;

/**
 * Created by Chershembeev_AE
 * Date: 12.08.2019
 * Time: 16:58.
 */
@ShellComponent
public class LibraryShellImpl implements LibraryShell {

    private LibraryServiceImpl libraryService;

    @Autowired
    public LibraryShellImpl(LibraryServiceImpl libraryService) {
        this.libraryService = libraryService;
    }

    @Override
    @ShellMethod(value = "show all books", key = "all-books")
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    @ShellMethod(value = "show all Authors names", key = "all-names")
    public List<String> getAllAuthorsNames() {
        return null;
    }

    @Override
    @ShellMethod(value = "show all genres", key = "all-genres")
    public List<String> getAllGenres() {
        return null;
    }

    @Override
    @ShellMethod(value = "show all books by Author name", key = "all-books-name")
    public List<Book> getBooksByAuthorsName(String name) {
        return null;
    }

    @Override
    @ShellMethod(value = "add new Genre", key = "add-genre")
    public boolean addNewGenre(Genre genre) {
        return false;
    }

    @Override
    @ShellMethod(value = "add new Book", key = "add-book")
    public boolean addNewBook(Book book) {
        return false;
    }

    @Override
    @ShellMethod(value = "add new Author", key = "add-author")
    public boolean addNewAuthor(Author author) {
        return false;
    }

    @Override
    @ShellMethod(value = "update Book by id", key = "update-book")
    public boolean updateBookTitleById(Long id, String newTitle) {
        return false;
    }

    @Override
    @ShellMethod(value = "delete Book by id", key = "delete-book")
    public boolean deleteBookById(Long id) {
        return false;
    }

    @Override
    @ShellMethod(value = "delete Author by id", key = "delete-author")
    public boolean deleteAuthorById(Long id) {
        return false;
    }

    @Override
    @ShellMethod(value = "delete Genre by genreName", key = "delete-genre")
    public boolean deleteGenre(String genreName) {
        return false;
    }

    @Override
    @ShellMethod(value = "delete all", key = "delete-all")
    public boolean deleteAll() {
        return false;
    }

    @Override

    public String getTableFromList(List<Book> books) {
        TableModelBuilder<String> modelBuilder = new TableModelBuilder<>();
        modelBuilder.addRow()
                .addValue("Book_id")
                .addValue("Author")
                .addValue("Title")
                .addValue("Genre");



        return null;
    }
}
