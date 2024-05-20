package com.cc.springbootbms.service.impl;

import com.cc.springbootbms.dao.TypeMapper;
import com.cc.springbootbms.pojo.Type;
import com.cc.springbootbms.service.TypeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/12/2
 * Time: 11:22
 * Description:
 */
@Service("typeService")
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> findAll() {
        return typeMapper.queryAll();
    }

}
