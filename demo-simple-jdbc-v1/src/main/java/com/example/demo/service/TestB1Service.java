package com.example.demo.service;

import com.github.pagehelper.PageInfo;

public interface TestB1Service
{

    java.util.List<com.example.demo.db.model.TestB1> listAll();
    
    PageInfo<com.example.demo.db.model.TestB1> page(Integer page,Integer num);
}
