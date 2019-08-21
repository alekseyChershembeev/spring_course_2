package com.spring.homework2.spring_course2.service;

import com.spring.homework2.spring_course2.entity.Author;
import java.util.List;

/**
 * Created by Chershembeev_AE
 * Date: 20.08.2019
 * Time: 15:39.
 */

public interface AuthorService {

    long create(Author author);

    void update(Author author);

    Author getById(long id);

    List<Author> getAll();

    void delete(long id);
}