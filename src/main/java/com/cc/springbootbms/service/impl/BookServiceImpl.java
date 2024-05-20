package com.cc.springbootbms.service.impl;

import com.cc.springbootbms.dao.BookMapper;
import com.cc.springbootbms.pojo.Book;
import com.cc.springbootbms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/2
 * Time: 10:01
 * Description:
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findBooks(String name) {
        return bookMapper.queryBooks(name);
    }

    @Override
    public Boolean addBook(Book book) {
        try {
            return bookMapper.insert(book) > 0;
        } catch (Exception ignored) {}
        return false;
    }

    @Override
    public Boolean delBook(Integer id) {
        return bookMapper.delete(id) > 0;
    }

    @Override
    public Book findById(Integer id) {
        return bookMapper.queryById(id);
    }

    @Override
    public Boolean modify(Book book) {
        return bookMapper.update(book) > 0;
    }

}
