package com.spring.homework2.spring_course2.service;

import com.spring.homework2.spring_course2.repository.BookRepository;
import com.spring.homework2.spring_course2.entity.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Chershembeev_AE
 * Date: 20.08.2019
 * Time: 15:41.
 */
@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;


    /**
     * Instantiates a new Book service.
     *
     * @param bookRepository the book repository
     */
    @Autowired
    public BookServiceImpl(final BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    @Override
    public long create(Book book) {
        return bookRepository.save(book).getBookId();
    }

    @Transactional
    @Override
    public boolean update(Book book) {
        return bookRepository.save(book).getBookId() > 0;
    }

    @Override
    public Book getById(final long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Transactional
    @Override
    public boolean delete(final long id) {

        return bookRepository.deleteBookByBookId(id) > 0;

    }
}
