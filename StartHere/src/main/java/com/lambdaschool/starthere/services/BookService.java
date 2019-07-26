package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book updateBook(Book book, long id);
    void delete(long id);
    void assignAuthor(long bookid, long authorid);
}
