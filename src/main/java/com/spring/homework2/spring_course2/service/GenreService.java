package com.spring.homework2.spring_course2.service;

import com.spring.homework2.spring_course2.entity.Genre;
import java.util.List;

/**
 * Created by Chershembeev_AE
 * Date: 20.08.2019
 * Time: 15:39.
 */
public interface GenreService {

    /**
     * Create long.
     *
     * @param genre the genre
     * @return the long
     */
    long create(Genre genre);

    /**
     * Update boolean.
     *
     * @param id the genre
     * @return the boolean
     */
    Genre getById(long id);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<Genre> getAll();

    /**
     * Delete boolean.
     *
     * @param id the id
     * @return the boolean
     */
    boolean delete(long id);
}
