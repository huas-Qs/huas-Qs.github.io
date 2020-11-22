package com.aqisheng.blog.service;

import com.aqisheng.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {

    Type saveType(Type type);
    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);
    Type updataType(Long id,Type type);
    void deleteType(Long id);
}
