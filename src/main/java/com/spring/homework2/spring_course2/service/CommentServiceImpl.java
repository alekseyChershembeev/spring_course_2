package com.spring.homework2.spring_course2.service;

import com.spring.homework2.spring_course2.repository.BookRepository;
import com.spring.homework2.spring_course2.repository.CommentRepository;
import com.spring.homework2.spring_course2.entity.Book;
import com.spring.homework2.spring_course2.entity.Comment;
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
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;
    private BookRepository bookRepository;


    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository, BookRepository bookRepository) {
        this.commentRepository = commentRepository;
        this.bookRepository = bookRepository;
    }

    @Transactional()
    @Override
    public boolean create(String text, long bookId) {
        Comment comment = new Comment();
        Book book = bookRepository.findById(bookId).orElse(new Book());
        book.setBookId(bookId);
        comment.setBook(book);
        comment.setCommentText(text);
        return commentRepository.save(comment).getCommentId() > 0;
    }

    @Override
    public List<Comment> getByBookId(long id) {
        return commentRepository.findByBookBookIdIs(id);
    }

    @Transactional()
    @Override
    public boolean delete(long id) {
        return commentRepository.deleteCommentByCommentId(id) > 0;
    }
}
