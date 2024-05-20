package com.cc.springbootbms.dao;

import com.cc.springbootbms.pojo.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/2
 * Time: 11:20
 * Description:
 */
@Repository
public interface TypeMapper {

    List<Type> queryAll();

}
