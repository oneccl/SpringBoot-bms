package com.cc.springbootbms.dao;

import com.cc.springbootbms.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/2
 * Time: 9:55
 * Description:
 */
@Repository
public interface BookMapper {

    List<Book> queryBooks(String name);

    Integer insert(Book book);

    Integer delete(Integer id);

    Book queryById(Integer id);

    Integer update(Book book);

}
