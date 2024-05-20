package com.cc.springbootbms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/2
 * Time: 9:39
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long bookId;
    private String bookName;
    private String author;
    private String buyDate;
    private Integer bookType;

    private Type type;

}
