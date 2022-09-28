package com.lvfang.mybatisplus.test.service.impl;

import com.lvfang.mybatisplus.test.model.T1;
import com.lvfang.mybatisplus.test.mapper.T1Mapper;
import com.lvfang.mybatisplus.test.service.IT1Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lvfang
 * @since 2022-05-25
 */
@Service
public class T1ServiceImpl extends ServiceImpl<T1Mapper, T1> implements IT1Service {

}
