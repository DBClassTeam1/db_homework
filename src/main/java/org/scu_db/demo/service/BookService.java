package org.scu_db.demo.service;

import org.scu_db.demo.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
    List<Book> findBookById(Integer Id);
    List<Book> findBookByIdUseSql(Integer Id);

    List<Book> findBooksByBorrowermemnoIsNotNull();
    Integer countBookByCallnumberIs(String callnumber);
}
