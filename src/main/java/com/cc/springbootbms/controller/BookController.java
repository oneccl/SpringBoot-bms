package com.cc.springbootbms.controller;

import com.cc.springbootbms.pojo.Book;
import com.cc.springbootbms.pojo.Type;
import com.cc.springbootbms.service.BookService;
import com.cc.springbootbms.service.TypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/2
 * Time: 10:02
 * Description:
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private TypeService typeService;

    // 图书列表(查询)
    @GetMapping("/")
    public String show(Model model,String name,Integer pageNo){
        // 分页
        if (pageNo == null){
            pageNo = 1;
        }
        PageHelper.startPage(pageNo,5);

        List<Book> books = bookService.findBooks(name);
        model.addAttribute("bookList",books);

        PageInfo<Book> pageInfo = new PageInfo<>(books);
        model.addAttribute("page",pageInfo);
        return "bookList";
    }

    // 添加
    @GetMapping("/toAdd.do")
    public String toAdd(){
        return "bookAdd";
    }

    @PostMapping("/add.do")
    public String add(Model model, Book book){
        if (bookService.addBook(book)){
            return "redirect:/";
        }
        model.addAttribute("res","添加失败!请重试!");
        return "bookAdd";
    }

    // 删除
    @GetMapping("/remove.do")
    public String remove(Integer id){
        if (bookService.delBook(id)){
            return "redirect:/";
        }
        return "bookList";
    }

    // 修改
    @GetMapping("/toModify.do")
    public String toModify(Model model, Integer id){
        // 根据id查询
        Book book = bookService.findById(id);
        model.addAttribute("findBook",book);
        List<Type> types = typeService.findAll();
        model.addAttribute("typeList",types);
        return "bookUpdate";
    }

    // redirect: 重定向
    // forward: 转发
    @PostMapping("/modify.do")
    public String modify(Book book){
        if (bookService.modify(book)){
            return "redirect:/";
        }
        return "forward:/toModify.do";
    }

}
