package com.cc.springbootbms.service;

import com.cc.springbootbms.pojo.Book;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/2
 * Time: 10:01
 * Description:
 */
public interface BookService {

    List<Book> findBooks(String name);

    Boolean addBook(Book book);

    Boolean delBook(Integer id);

    Book findById(Integer id);

    Boolean modify(Book book);

}
