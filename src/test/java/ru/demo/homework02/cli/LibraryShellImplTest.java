package ru.demo.homework02.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.shell.Shell;
import org.springframework.test.context.junit4.SpringRunner;
import ru.demo.homework02.dao.AuthorDaoImpl;
import ru.demo.homework02.dao.BookDaoImpl;
import ru.demo.homework02.dao.GenreDaoImpl;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryShellImplTest {

    private static final String TEST_TITLE_1 = "testName";
    private static final String TEST_TITLE_2 = "testName2";
    private static final String TEST_AUTHOR_1 = "testAuthor";
    private static final String TEST_AUTHOR_2 = "testAuthor2";
    private static final String TEST_GENRE_1 = "testGenre";
    private static final String TEST_GENRE_2 = "testGenre2";


    @Autowired
    private Shell shell;

    @Autowired
    private BookDaoImpl bookDao;

    @Autowired
    private AuthorDaoImpl authorDao;

    @Autowired
    private GenreDaoImpl genreDao;

    @Before
    public void setUp() {
        genreDao.deleteAll();
        authorDao.deleteAll();
        bookDao.deleteAll();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getAllBooks() {
    }

    @Test
    public void getAllAuthorsNames() {
    }

    @Test
    public void getAllGenres() {
    }

    @Test
    public void getBooksByAuthorsName() {
    }

    @Test
    public void addNewGenre() {
    }

    @Test
    public void addNewBook() {
    }

    @Test
    public void addNewAuthor() {
    }

    @Test
    public void updateBookTitleById() {
    }

    @Test
    public void deleteBookById() {
    }

    @Test
    public void deleteAuthorById() {
    }

    @Test
    public void deleteGenre() {
    }

    @Test
    public void deleteAll() {
    }

    @Test
    public void getTableFromList() {
    }
}