package com.example.demo.service;

import java.util.List;

import com.common.util.PageHelperUtil;
import com.example.demo.domain.T1;
import com.github.pagehelper.PageInfo;

public interface IT1Service
{

    public List<T1> listAll();
    
    public List<T1> listAll(T1 req);
    
    PageInfo selectPage(T1 req, PageHelperUtil pageHelperUtil);
}
